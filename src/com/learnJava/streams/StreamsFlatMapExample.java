package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsFlatMapExample {



    public static List<String> printStudentActivities() {

        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .peek(System.out::println)
                .distinct()
                .peek((s) -> System.out.println("distinct "+s))
                .sorted()
                .peek((s) -> System.out.println("sorted "+s))
                .collect(toList());

    }

    public static Long getStudentActivitiesCount() {

        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();

    }



    public static void main(String[] args) {

        System.out.println(printStudentActivities());
        System.out.println(getStudentActivitiesCount());

    }
}
