package com.javalearning.lambdas;

public class RunnableLambdaExample1 {

    public static void main(String[] args) {
        /**
         * Prior Java 8
         */

        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                System.out.println("Inside runnable 1");
            }
        };

        new Thread(runnable).start();


        /**
         * Java 8 Lambda syntax
         * () -> {}
         */
        Runnable runnableLambda1 = () -> {
            System.out.println("Inside Runnable 2");
        };
        new Thread(runnableLambda1).start();

        // Simplified version - only one statement
        Runnable runnableLambda2 = () -> System.out.println("Inside Runnable 3");
        new Thread(runnableLambda2).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable 3.1");
            }
        });
        new Thread(() -> System.out.println("Inside runnable 4")).start();


    }
}
