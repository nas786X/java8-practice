package com.learnJava.optional;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalExample {

    public static String getStudentName() {
//        Student student = StudentDataBase.studentSupplier.get();

        Student student = null;

        if (student != null) {
            return student.getName();
        }else  {
            return null;
        }
    }

    public static Optional<String> getStudentNameOptional() {

//        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);

        if(studentOptional.isPresent()) {
            return studentOptional.map(Student::getName);
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
//        String name = getStudentName();
//
//        if (name != null) {
//            System.out.println(name.length());
//        }else {
//            System.out.println("Name not found");
//        }
        Optional<String> studentNameOptional = getStudentNameOptional();
        if (studentNameOptional.isPresent()) {
            System.out.println(studentNameOptional.get());
        }else{
            System.out.println("Student name is empty");
        }

    }

}
