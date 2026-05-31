package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        Predicate<Student> studentPredicate = s-> s.getGradeLevel() >= 3;
        Predicate<Student> studentGpaPredicate = s-> s.getGpa() >= 3.9;
        System.out.println(StudentDataBase.getAllStudents());
        System.out.println("-------------------");
        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                .peek(System.out::println)
                .filter(studentPredicate)
                .peek(s-> {System.out.println("after studentPredicate "+s);})
                .filter(studentGpaPredicate)
                .peek(s-> {System.out.println("after studentGpaPredicate "+s);})
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(studentMap);
    }
}
