package com.robosathi.agent.solid;

abstract class Bird {
    String name;

    public Bird(String name) {
        this.name = name;
    }

    public abstract void eat();
}
