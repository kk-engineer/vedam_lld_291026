package com.robosathi.agent.solid;

import com.robosathi.agent.solid.interfaces.Flyable;

public class Eagle extends Bird implements Flyable {
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " eats");
    }

    @Override
    public void fly() {
        System.out.println(name + "  flies");
    }
}
