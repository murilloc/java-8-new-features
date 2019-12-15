package com.javalearning.functionalInterfaces;

import com.javalearning.data.Student;
import com.javalearning.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    static Supplier<Student> studentSupplier = () -> {
        return new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));
    };

    static Supplier<List<Student>> studentListSupplier = StudentDataBase::getAllStudents;

    public static void main(String[] args) {

        System.out.println("Result: "+ studentSupplier.get());

        System.out.println("Result for List: "+ studentListSupplier.get());

    }
}
