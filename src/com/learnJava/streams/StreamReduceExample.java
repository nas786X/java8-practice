package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {


    public static int performMultiplication(List<Integer> numbers) {
        return numbers.stream().reduce(1, (a, b)  -> a * b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> numbers) {
        return numbers.stream().reduce((a, b)  -> a * b);
    }

    public static Optional<Student> getHighestGpaStudent(){
        return StudentDataBase.getAllStudents()
                .stream().reduce(
                        (s1,s2) -> {
                            if(s1.getGpa() > s2.getGpa()){
                                return s1;
                            }else{
                                return s2;
                            }
                        }
                );
    }

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 3,5,7);
        System.out.println(performMultiplication(numbers));

        List<Integer> numbers2 = new ArrayList<>();
//        System.out.println(performMultiplicationWithoutIdentity(numbers2));

        Optional<Student> studentOptional = getHighestGpaStudent();
        studentOptional.ifPresent(System.out::println);
    }

}
