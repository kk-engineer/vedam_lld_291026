package com.robosathi.agent.design_patterns.builder;

public class Main {
    public static void main(String[] args) {

        Student s1 = Student.builder()
                .name("KK")
                .email("kk@x.com")
                .batch(2029)
                .build();

        System.out.println(s1);
    }
}
