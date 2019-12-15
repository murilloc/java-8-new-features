package com.javalearning.functionalInterfaces;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.util.Enumeration;
import java.util.function.Predicate;

public class PredicateExample {

    private static Predicate<Integer> evenPredicate = (number) -> {
        return number % 2 == 0;
    };
    private static Predicate<Integer> evenPredicate2 = (number) -> number % 2 == 0;
    private static Predicate<Integer> divisibleByFivePredicate = (number) -> number % 5 == 0;

    public static void predicateAnd() {
        System.out.println("The predicate 'AND' result is: " + evenPredicate.and(divisibleByFivePredicate).test(10)); // Predicate chaining
        System.out.println("The predicate 'AND' result is: " + evenPredicate.and(divisibleByFivePredicate).test(12)); // Predicate chaining
    }

    public static void predicateOr() {
        System.out.println("The predicate 'OR' result is: " + evenPredicate.or(divisibleByFivePredicate).test(10)); // Predicate chaining
        System.out.println("The predicate 'OR' result is: " + evenPredicate.or(divisibleByFivePredicate).test(12)); // Predicate chaining
    }

    public static void predicateNegate() {
        System.out.println("The predicate 'NEGATE' result is: " + evenPredicate.or(divisibleByFivePredicate).negate().test(10)); // Predicate chaining
        System.out.println("The predicate 'NEGATE' result is: " + evenPredicate.or(divisibleByFivePredicate).negate().test(12)); // Predicate chaining
    }

    public static void main(String[] args) {

        System.out.println(evenPredicate.test(4));
        System.out.println(evenPredicate2.test(15));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
