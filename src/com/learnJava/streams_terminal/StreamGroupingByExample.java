package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.*;

import static java.util.stream.Collectors.*;

public class StreamGroupingByExample {

 // group based on gender
    public static void groupStudentsByGender(){
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGender));
        studentMap.forEach((gender, students) -> {
            System.out.println(gender);
            students.forEach(System.out::println);
        });
    }

    public static void customizedGroupingBy(){
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy((s)-> s.getGpa() >= 3.8 ? "Outstanding" : "Average"));
        studentMap.forEach((cat, students) -> {
            System.out.println(cat);
            students.forEach(System.out::println);
        });
    }

    public static void twoLevelGrouping_1(){
       Map<Integer, Map<String, List<Student>>> studentMap= StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel, groupingBy((s)-> s.getGpa() >= 3.8 ? "Outstanding" : "Average")));
       System.out.println(studentMap);
    }

    public static void twoLevelGrouping_2(){
        Map<Integer, Integer> studentMap= StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel, summingInt(Student::getNoteBooks)));
        System.out.println(studentMap);
    }

    public static void threeArgumentGroupBy(){

        LinkedHashMap<String, Set<Student>>  studentLinkedHashMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGender, LinkedHashMap::new, toSet()));

        System.out.println(studentLinkedHashMap);

    }

    public static void calculateTopGpa() {
        Map<Integer, Optional<Student>>  studentMapOptional = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel, maxBy(Comparator.comparing(Student::getGpa))));
//        System.out.println(studentMapOptional);

        Map<Integer, Student>  studentMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
        System.out.println(studentMap);
    }

    public static void calculateLeastGpa() {
        Map<Integer, Optional<Student>>  studentMapOptional = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel, maxBy(Comparator.comparing(Student::getGpa))));
//        System.out.println(studentMapOptional);

        Map<Integer, Student>  studentMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,collectingAndThen(minBy(Comparator.comparing(Student::getGpa)), Optional::get)));
        System.out.println(studentMap);
    }


    public static void main(String[] args) {
//        groupStudentsByGender();
//        customizedGroupingBy();
//        twoLevelGrouping_1();
//        twoLevelGrouping_2();
//        threeArgumentGroupBy();
        calculateTopGpa();
    }
}
