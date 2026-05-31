package com.learnJava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {


    public static int findMaxValue(List<Integer> list){
        return list.stream().reduce( 0, (x, y) -> x>y?x:y);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> list){
        return list.stream().reduce( (x, y) -> x>y?x:y);
    }

    public static Optional<Integer> findMinValueOptional(List<Integer> list){
        return list.stream().reduce( (x, y) -> x<y?x:y);
    }

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4);
        // System.out.println(findMaxValueOptional(integerList));

        Optional<Integer> maxValue = findMaxValueOptional(integerList);
        maxValue.ifPresent(System.out::println);

        Optional<Integer> minValue = findMinValueOptional(integerList);
        minValue.ifPresent(System.out::println);

    }
}
