package com.learnJava.numericStreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {

    public static void main(String[] args) {

        IntStream intStream1 = IntStream.range(1,50);
        System.out.println(intStream1.count());

        IntStream intStream2 = IntStream.rangeClosed(1,50);
        System.out.println(intStream2.count());
        System.out.println("------");
        IntStream.range(1,50).forEach(System.out::println);
        System.out.println("------");
        IntStream.rangeClosed(1,50).forEach(System.out::println);
        System.out.println("------");
        LongStream longStream1 = LongStream.range(1,50);
        System.out.println(longStream1.count());

        LongStream longStream2 = LongStream.rangeClosed(1,50);
        System.out.println(longStream2.count());
        System.out.println("------");
        LongStream.range(1,50).forEach(System.out::println);
        System.out.println("------");
        LongStream.rangeClosed(1,50).forEach(System.out::println);
        System.out.println("------");

        IntStream.rangeClosed(1,50).asDoubleStream().forEach(System.out::println);


    }
}
