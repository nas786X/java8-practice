package com.learnJava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> list){
        return list.stream()
                .limit(2)
                .reduce( (x, y) -> x+y);

    }

    public static Optional<Integer> skip(List<Integer> list){
        return list.stream()
                .skip(2)
                .reduce( (x, y) -> x+y);

    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(6,7,8,9,10);
        limit(integers).ifPresentOrElse(System.out::println,()->{System.out.println("Empty");});
        skip(integers).ifPresentOrElse(System.out::println,()->{System.out.println("Empty");});
    }
}
