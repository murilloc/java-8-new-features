package com.javalearning.functionalInterfaces;

import com.javalearning.data.Student;
import com.javalearning.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    private static List<Student> studentList = StudentDataBase.getAllStudents();
    private static Predicate<Student> studentGradeLevelPredicate = (student) -> student.getGradeLevel() >= 3;
    private static Predicate<Student> studentGpaPredicate = (student) -> student.getGpa() >= 3.8;

    public static void filterStudentByGradeLevel() {

        System.out.println("------ Grade Level Predicate -------");
        studentList.forEach((student -> {
            if (studentGradeLevelPredicate.test(student)) {
                System.out.println(student);
            }
        }));
    }

    public static void filterStudentByGpa() {

        System.out.println("------ GPA Predicate -------");
        studentList.forEach((student -> {
            if (studentGpaPredicate.test(student)) {
                System.out.println(student);
            }
        }));
    }


    public static void  filterStudentsByGpaAndGradeLevel(){
        System.out.println("------ GPA and Grade Level Predicate -------");
        studentList.forEach((student ->{
            if(studentGpaPredicate.and(studentGradeLevelPredicate).test(student)){ // predicate chaining
                System.out.println(student);
            }
        }));

    }

    public static void  filterStudentsByGpaOrGradeLevel(){
        System.out.println("------ GPA or Grade Level Predicate -------");
        studentList.forEach((student ->{
            if(studentGpaPredicate.or(studentGradeLevelPredicate).test(student)){ // predicate chaining
                System.out.println(student);
            }
        }));

    }


    public static void  filterStudentsByGpaNorGradeLevel(){
        System.out.println("------ GPA nor Grade Level Predicate -------");
        studentList.forEach((student ->{
            if(studentGpaPredicate.or(studentGradeLevelPredicate).negate().test(student)){ // predicate chaining
                System.out.println(student);
            }
        }));

    }

    public static void  filterStudentsByGpaNandGradeLevel(){
        System.out.println("------ GPA nand Grade Level Predicate -------");
        studentList.forEach((student ->{
            if(studentGpaPredicate.and(studentGradeLevelPredicate).negate().test(student)){ // predicate chaining
                System.out.println(student);
            }
        }));

    }

    public static void main(String[] args) {

        filterStudentByGradeLevel();
        filterStudentByGpa();
        filterStudentsByGpaAndGradeLevel();
        filterStudentsByGpaOrGradeLevel();
        filterStudentsByGpaNorGradeLevel();
        filterStudentsByGpaNandGradeLevel();

    }


}
