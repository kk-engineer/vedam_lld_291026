package com.robosathi.agent.design_patterns.singleton;

public class Main {

    public static void main(String[] args) {

        DBConnection firstRef = DBConnection.getInstance();
        DBConnection secondRef = DBConnection.getInstance();
        DBConnection thirdRef = DBConnection.getInstance();


        System.out.println("Done");
    }
}
