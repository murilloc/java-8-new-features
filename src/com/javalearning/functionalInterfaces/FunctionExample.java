package com.javalearning.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {

    //static Function<String, String> function = String::toUpperCase;
    static Function<String, String> function = (name) -> name.toUpperCase();
    static Function<String, String> addSomeString = (name) -> name.toUpperCase().concat(" is awesome!");



    public static void main(String[] args) {

        System.out.println("Result is:" + function.apply("java 8"));
        System.out.println("Result of 'andThen' is : " + function.andThen(addSomeString).apply("java 8") );
        System.out.println("Result of 'compose' is : " + function.compose(addSomeString).apply("java 8") );
        System.out.println("Result of 'andThen and compose' is : " + function.andThen(addSomeString).compose(addSomeString).apply("java 8") );

    }
}
