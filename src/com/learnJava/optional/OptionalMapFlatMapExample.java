package com.learnJava.optional;

import com.learnJava.data.Bike;
import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    public static void optionalFilter() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        studentOptional.filter(student -> student.getGpa() >= 3.5)
                .ifPresent(System.out::println);
    }

    public static void optionalMap() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        if (studentOptional.isPresent()) {
            Optional<String> stringOptional = studentOptional.filter(student -> student.getGpa() >= 3.5)
                    .map(student -> student.getName());
            System.out.println(stringOptional);
        }
    }

    public static void optionalFlatMap() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<String> name = studentOptional.filter(student -> student.getGpa() >= 3.5)
                .flatMap(Student::getBike)
                .map(Bike::getName);
        name.ifPresent(System.out::println);
    }


    public static void main(String[] args) {
//        optionalFilter();
//        optionalMap();
        optionalFlatMap();
    }
}
