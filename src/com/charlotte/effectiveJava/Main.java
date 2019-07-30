package com.charlotte.effectiveJava;

public class Main {

    public static void main(String[] args) {
        Test test = new Test.Builder(10,20,30).params4("p4 init").params6("p6 init").build();

        System.out.println(test.toString());
    }
}
