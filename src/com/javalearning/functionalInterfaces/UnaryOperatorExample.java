package com.javalearning.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    static UnaryOperator<String> unaryOperator= (string) -> string.concat(", Hello there!");
    public static void main(String[] args) {

        System.out.println("Result: " + unaryOperator.apply("Java 8"));

    }
}
