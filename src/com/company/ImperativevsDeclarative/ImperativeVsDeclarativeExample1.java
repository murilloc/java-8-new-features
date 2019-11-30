package com.company.ImperativevsDeclarative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {

    public static void main(String[] args) {

        /**
         * Imperative - HOW style of programming
         */

        int imperativeSum = 0;
        for (int i = 0; i <= 100; i++) {
            imperativeSum += i;
        }
        System.out.println("Sum using imperative approach: " + imperativeSum);


        /**
         * Declarative - WHAT style of programming
         */

        int declarativeSum = IntStream.rangeClosed(0,100).sum();

        System.out.println("Sum using the declarative approach: " + declarativeSum);


    }
}
