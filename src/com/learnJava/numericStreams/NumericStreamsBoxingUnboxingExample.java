package com.learnJava.numericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxingExample {

    public static List<Integer> boxing(){
        return IntStream.rangeClosed(1,10)
                .boxed()
                .collect(Collectors.toList());
    }

    public static int unBoxing(List<Integer> integerList){
         return integerList.stream()
                 .mapToInt(Integer::intValue)
                 .sum();
    }


    public static void main(String[] args) {

        List<Integer> integerList = boxing();
        System.out.println(integerList);
        int sum =  unBoxing(integerList);
        System.out.println(sum);

    }


}
