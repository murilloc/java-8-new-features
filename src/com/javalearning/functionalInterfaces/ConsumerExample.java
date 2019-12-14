package com.javalearning.functionalInterfaces;

import com.javalearning.data.Student;
import com.javalearning.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    private static Consumer<Student> studentConsumer = (student) -> System.out.println(student);
    private static Consumer<Student> studentNameConsumer = (student) -> System.out.print(student.getName());
    private static Consumer<Student> studentActivitiesConsumer = (student) -> System.out.println(student.getActivities());
    private static List<Student> studentList;

    public static void main(String[] args) {

        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
        c1.accept("Java 8");

        studentList = StudentDataBase.getAllStudents();
        printStudents();
        printNameAndActivities();
        printNameAndActivitiesWithConditions();
        printNameAndActivitiesWithConditions2();
    }

    public static void printNameAndActivities() {
        studentList.forEach(studentNameConsumer.andThen(studentActivitiesConsumer)); // consumer chaining
    }


    public static void printNameAndActivitiesWithConditions() {
        System.out.println("---Name and Activities with conditions-------");

        studentList.forEach((student -> {
            if (student.getGradeLevel() >= 3) {
                studentNameConsumer.andThen(studentActivitiesConsumer).accept(student);
            }
        }));
    }


    public static void printNameAndActivitiesWithConditions2() {

        System.out.println("---Name and Activities with conditions 2-------");

        studentList.forEach((student -> {
            if (student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
                studentNameConsumer.andThen(studentActivitiesConsumer).accept(student);
            }
        }));
    }


    public static void printStudents() {

        studentList.forEach(studentConsumer);
    }


}
