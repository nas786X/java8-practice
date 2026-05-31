package com.learnJava.defaults;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsExample2 {

    static Consumer<Student> studentConsumer = System.out::println;
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> gpaComparator = Comparator.comparingDouble(Student::getGpa);
    static Comparator<Student> gradeComparator = Comparator.comparingDouble(Student::getGradeLevel);

    public static void sortByName(List<Student> students) {
        students.sort(nameComparator); //default sort method of list
        students.forEach(studentConsumer);
    }

    public static void sortByGpa(List<Student> students) {
        students.sort(gpaComparator); //default sort method of list
        students.forEach(studentConsumer);
    }

    public static void comparatorChaining(List<Student> students){
        students.sort(gradeComparator.thenComparing(nameComparator));
        students.forEach(studentConsumer);
    }

    public static void sortWithNullValues(List<Student> students){
        Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
        students.sort(studentComparator);
        students.forEach(studentConsumer);
    }


    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();
//        System.out.println("Before sortByName:");
//        students.forEach(studentConsumer);
//        System.out.println("After sortByName:");
//        sortByName(students);
//        System.out.println("After sortByGpa:");
//        sortByGpa(students);
//        System.out.println("comparator chaining");
//        comparatorChaining(students);
        sortWithNullValues(students);
    }
}
