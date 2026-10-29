package com.robosathi.agent.solid;

import com.robosathi.agent.solid.interfaces.Singable;

public class Songbird extends Bird implements Singable {
    public Songbird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name +  " eats");
    }

    @Override
    public void sing() {
        System.out.println(name + " sings");
    }
}
