package com.learnJava.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalOfEmptyNullableExample {

    public static Optional<String> offNullable() {
        Optional<String> stringOptional = Optional.ofNullable("Hello");
        return stringOptional;
    }

    public static Optional<String> of() {
        Optional<String> stringOptional = Optional.ofNullable(null);
        return stringOptional;
    }

    public static Optional<String> empty() {

        return Optional.empty();
    }

    public  static void main(String[] args) {
        /*System.out.println(offNullable());
        System.out.println(of());
        System.out.println(empty());*/
//
//        Optional<String> name = Optional.ofNullable("null");
//        name.ifPresentOrElse(System.out::println, ()->System.out.println("name is not present"));

        List<String> names = Arrays.asList("Nasir","Sruthi","Michael", null);
        names.stream().filter(Objects::nonNull).filter(n->n.toLowerCase().startsWith("s")).forEach(System.out::println);

        Stream<Integer> stream = Stream.iterate(1, n->n+1).limit(10);
        stream.filter(n->n%2==0).forEach(System.out::println);

    }
}
