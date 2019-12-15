package com.javalearning.functionalInterfaces;

import com.javalearning.data.Student;
import com.javalearning.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

    static Function<List<Student>, Map<String, Double>> studentFunction = (studentList -> {
        Map<String, Double> studentGradeMap = new HashMap<>();
        studentList.forEach((student -> {
            if (PredicateStudentExample.studentGradeLevelPredicate.test(student)) {
                studentGradeMap.put(student.getName(), student.getGpa());
            }
        }));

        return studentGradeMap;
    });

    public static void main(String[] args) {

        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));

    }
}
