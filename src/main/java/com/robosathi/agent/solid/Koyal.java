package com.robosathi.agent.solid;

import com.robosathi.agent.solid.interfaces.Flyable;
import com.robosathi.agent.solid.interfaces.Singable;


public class Koyal extends Bird implements Flyable, Singable {


    public Koyal(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(name + " fly.");
    }

    @Override
    public void sing() {
        System.out.println(name + " sing.");
    }

    @Override
    public void eat() {
        System.out.println(name + " eat.");
    }
}
