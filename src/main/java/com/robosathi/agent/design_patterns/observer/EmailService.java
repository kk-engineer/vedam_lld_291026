package com.robosathi.agent.design_patterns.observer;

public class EmailService implements Subscriber{
    @Override
    public void update() {
        System.out.println("Email has been sent to the user.");
    }
}
