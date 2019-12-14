package com.javalearning.ImperativevsDeclarative;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Removing a duplicate from a list of integers
 */
public class ImperativeVsDeclarativeExample2 {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10);

        /*
         * Imperative approach
         */

        List<Integer> uniqueList = new ArrayList<>();
        for (Integer integer : integerList) {
            if (!uniqueList.contains((integer))) {
                uniqueList.add(integer);
            }
        }

        System.out.println("Unique List 1: " + uniqueList);

        /*
         * Declarative approach
         */

        List<Integer> integerList1 = integerList.stream().distinct().collect(Collectors.toList());

        System.out.println("Unique List 2: " + integerList1);
    }
}
