package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;

        System.out.println(binaryOperator.apply(10, 20));

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println(maxBy.apply(10, 20));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println(minBy.apply(10, 20));

    }
}
