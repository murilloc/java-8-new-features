package com.javalearning.functionalInterfaces;

import com.javalearning.data.Student;
import com.javalearning.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    private static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void nameAndActivities() {
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println( name + ": " +  activities);

        studentList.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
    }

    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a, b) -> {
            System.out.println("a: " + a + ", b: " + b);
        };

        biConsumer.accept("Java 7", "Java 8");

        BiConsumer<Integer, Integer> multiplication = (a, b) -> {

            System.out.println("Multiplication is :" + (a * b));
        };

        BiConsumer<Integer, Integer> division = (a, b) -> {

            System.out.println("Division is :" + (a / b));
        };


        multiplication.andThen(division).accept(20, 10);

        nameAndActivities();

    }
}
