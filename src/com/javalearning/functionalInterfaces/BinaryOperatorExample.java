package com.javalearning.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static BinaryOperator<Integer> binaryOperator = (opa, opb)-> opa * opb;
    static Comparator<Integer> comparator = Integer::compareTo;

    public static void main(String[] args) {

        System.out.println("Result: " + binaryOperator.apply(13,24));
        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println("Comparator MAX result: " + maxBy.apply(75,5));
        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println("Comparator MIN result: " + minBy.apply(7,5));


    }
}
