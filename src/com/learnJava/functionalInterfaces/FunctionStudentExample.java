package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

    static Function<List<Student>, Map<String, Double>> studentFunction = students ->  {
        Map<String, Double> studentGradeMap = new HashMap<>();
        students.forEach(student -> {
            studentGradeMap.put(student.getName(), student.getGpa());
        });
        return studentGradeMap;
    };

    public static void main(String[] args) {

        List<Student> students = StudentDataBase.getAllStudents();

        System.out.println(studentFunction.apply(students));

    }
}
