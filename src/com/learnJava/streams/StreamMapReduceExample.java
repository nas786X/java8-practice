package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamMapReduceExample {

    private static int noOfNoteBooks() {

        return StudentDataBase.getAllStudents().stream()
                .filter(s->s.getGradeLevel()>=3)
                .map(Student::getNoteBooks)
                .reduce(0, Integer::sum);

    }

    public static void main(String[] args) {
        System.out.println(noOfNoteBooks());
    }
}
