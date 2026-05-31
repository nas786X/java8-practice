package com.learnJava.imperativesdeclarative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarationExample1 {
    public static void main (String[] args){

//      Imperative Style of Programming
        int sum = 0;
        for(int i=0; i<=100; i++){
            sum+=i;
        }
        System.out.println("sum="+sum);
//      Declarative Style of Programming
        int sum1 = IntStream.rangeClosed(0,100).parallel().sum();
        System.out.println("sum1="+sum1);
    }
}
