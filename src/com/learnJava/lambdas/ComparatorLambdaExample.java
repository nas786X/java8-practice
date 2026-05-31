package com.learnJava.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    static void main(String[] args) {
//  prior java 8

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);//  0 -> o1 == o2
                                        //  1 -> o1 > o2
                                        // -1 -> o1 < o2
            }
        };
        System.out.println("Result of comparator is: " + comparator.compare(1, 2));

//  lambda way
        Comparator<Integer> comparatorLambda = (o1, o2) -> o1.compareTo(o2);
        System.out.println("Result of comparatorLambda is: " + comparatorLambda.compare(1, 2));

    }
}
