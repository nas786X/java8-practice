package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));

        System.out.println(studentSupplier.get());

        Supplier<List<Student>> studentSupplier1 = () -> StudentDataBase.getAllStudents();

        System.out.println(studentSupplier1.get());
    }
}
