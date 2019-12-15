package com.javalearning.functionalInterfaces;

import com.javalearning.data.Student;
import com.javalearning.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    private static Predicate<Student> studentGradeLevelPredicate = (student) -> student.getGradeLevel() >= 3;
    private static Predicate<Student> studentGpaPredicate = (student) -> student.getGpa() >= 3.9;
    private static BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);

    private static Consumer<Student> studentConsumer = (student -> {
        if (studentGradeLevelPredicate.and(studentGpaPredicate).test(student)) {
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }
    });


    public static void printNameAndActivities(List<Student> studentList) {

        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents();
        printNameAndActivities(studentList);
    }
}
