package com.learnJava.optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {

     public static String optionalOrElse(){
//         Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
         Optional<Student> studentOptional = Optional.ofNullable(null);
         String name = studentOptional.map(Student::getName).orElse("default");
         return name;
     }

    public static String optionalOrElseGet(){
//         Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElseGet(()->"default");
        return name;
    }

    public static String optionalOrElseThrow(){
//         Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElseThrow(()->new RuntimeException("No Data Available"));
        return name;
    }
    public static void main(String[] args) {
        System.out.println(optionalOrElse());
        System.out.println(optionalOrElseGet());
        System.out.println(optionalOrElseThrow());
    }
}
