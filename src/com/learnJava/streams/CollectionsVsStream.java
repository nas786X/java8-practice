package com.learnJava.streams;

import com.learnJava.data.Student;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStream {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("adam");
        names.add("bob");
        names.add("dave");

        names.remove("bob");
//      System.out.println(names);


        for(String name : names){
            System.out.println(name);
        }

        for(String name : names){
            System.out.println(name);
        }

        Stream<String> nameStream =  names.stream();
        nameStream.forEach(System.out::println);
//      nameStream.forEach(System.out::println); cannot iterate second because stream has already been operated upon or closed

        

    }
}
