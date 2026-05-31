package com.learnJava.numericStreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {

    public static void main(String[] args) {

        int sum = IntStream.rangeClosed(1,50).sum();
        System.out.println("Sum is : " + sum);

        OptionalInt optionalInt = IntStream.rangeClosed(1,50).max();
        optionalInt.ifPresent((n)-> {
            System.out.println("The max value is " + n);
        });

        OptionalLong optionalLong = LongStream.rangeClosed(50,100).min();
        optionalLong.ifPresent((n)-> {
            System.out.println("The min value is " + n);
        });

        OptionalDouble optionalDouble = IntStream.rangeClosed(1,50).average();
        optionalDouble.ifPresent((n)-> {
            System.out.println("The average value is " + n);
        });

    }

}
