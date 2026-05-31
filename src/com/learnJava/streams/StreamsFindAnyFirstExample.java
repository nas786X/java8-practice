package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

    public static Optional<Student> findAnyStudent(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa() >= 3.9)
                .findAny();
    }

    public static Optional<Student> findFirstStudent(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa() >= 4.1)
                .findAny();
    }

    public static void main(String[] args) {
        findAnyStudent()
                .ifPresentOrElse(s->System.out.println("Found the student :"+s),
                        ()->System.out.println("Student not found"));
        findFirstStudent()
                .ifPresentOrElse(s->System.out.println("Found the student :"+s),
                        ()->System.out.println("Student not found"));
    }

}
