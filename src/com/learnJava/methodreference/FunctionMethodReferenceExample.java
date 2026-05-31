package com.learnJava.methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String, String> toUpperCase = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(toUpperCase.apply("java8"));
    }
}
