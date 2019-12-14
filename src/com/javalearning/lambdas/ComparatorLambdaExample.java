package com.javalearning.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {

        /**
         * Prior Java 8
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {

                /*
                o1 == o2 -> 0
                o1 >  o2 -> 1
                o1 <  o2 -> -1;
                 */
                return o1.compareTo(o2);
            }
        };

        System.out.println("Result of the comparator is: " + comparator.compare(3, 1));


        /**
         * Now using lambda expressions
         */
        Comparator<Integer> lambdaComparator = (Integer a, Integer b) -> a.compareTo(b);
        System.out.println("Result of the comparator using Lambdas is: " + lambdaComparator.compare(3, 1));

        Comparator<Integer> lambdaComparator2 = (a, b) -> a.compareTo(b);
        System.out.println("Result of the comparator using Lambdas is: " + lambdaComparator2.compare(3, 1));

        Comparator<Integer> lambdaComparatorWithMethodReference = Integer::compareTo;
        System.out.println("Result of the comparator using Lambda and Method Reference is: " + lambdaComparatorWithMethodReference.compare(3, 1));
    }
}
