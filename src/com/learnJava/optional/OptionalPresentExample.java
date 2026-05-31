package com.learnJava.optional;

import java.util.Optional;

public class OptionalPresentExample {

    public static void main(String[] args) {
        //isPresent
        Optional<String> optional = Optional.ofNullable("hello optional");
        System.out.println(optional.isPresent());
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }
        //ifPresent
        optional.ifPresentOrElse(System.out::println, () -> System.out.println("not present"));
    }

}
