package com.learnJava.lambdas;

import java.util.function.Consumer;

public class LambdaVariable1 {

    public static void main(String[] args) {

        int i2 = 0;

        Consumer<Integer> c1 = i -> {

//            int i2 = 3;

            System.out.println(i2);
        };
    }
}
