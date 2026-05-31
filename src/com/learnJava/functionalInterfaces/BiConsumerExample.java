package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities(){

        BiConsumer<String,List<String>> biConsumer = (name, activities) -> System.out.println(name + " " + activities);
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> biConsumer.accept(student.getName(),student.getActivities()));

    }



    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer = (s1, s2) -> System.out.println(s1 + " " + s2);
        biConsumer.accept("java8", "java8");
        BiConsumer<Integer,Integer> multiply = (i, j) -> System.out.println("Multiplication is: " + i * j);
        BiConsumer<Integer,Integer> division = (i,j) -> System.out.println("Division is: " + i / j);
        multiply.andThen(division).accept(10,5);
        nameAndActivities();

    }
}
