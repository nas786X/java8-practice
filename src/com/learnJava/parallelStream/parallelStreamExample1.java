package com.learnJava.parallelStream;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class parallelStreamExample1 {


    public static List<String> sequentialPrintStudentActivities() {
        long start = System.currentTimeMillis();
        List<String> studentActivities =  StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());
        long end = System.currentTimeMillis();
        System.out.println("Sequential Stream " + (end - start));
        return studentActivities;
    }

    public static List<String> parallelPrintStudentActivities() {

        long start = System.currentTimeMillis();
        List<String> studentActivities =  StudentDataBase.getAllStudents().stream()
                .parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());
        long end = System.currentTimeMillis();
        System.out.println("Parallel Stream "+ (end - start));
        return studentActivities;

    }

    public static void main(String[] args) {
        sequentialPrintStudentActivities();
        parallelPrintStudentActivities();
    }
}
