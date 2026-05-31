package com.learnJava.parallelStream;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class ParallelStreamBoxedExample {

    public static int sequentialSum(List<Integer> numbers) {
        long start = System.currentTimeMillis();
        int sum = numbers.stream().reduce(0, Integer::sum);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        return sum;
    }

    public static int parallelSum(List<Integer> numbers) {
        long start = System.currentTimeMillis();
        int sum = numbers.parallelStream().reduce(0, Integer::sum);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integerList = IntStream.rangeClosed(1,10000)
                .boxed()
                .collect(toList());

        sequentialSum(integerList);
        parallelSum(integerList);
    }
}
