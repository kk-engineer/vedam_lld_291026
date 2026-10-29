package com.robosathi.agent;

import com.robosathi.agent.solid.Eagle;
import com.robosathi.agent.solid.Koyal;
import com.robosathi.agent.solid.Penguin;
import com.robosathi.agent.solid.Songbird;
import com.robosathi.agent.solid.interfaces.Flyable;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Eagle b1 = new Eagle("Eagle");
        b1.fly();
        b1.eat();

        Koyal b2 = new Koyal("Koyal");
        b2.sing();
        b2.fly();
        b2.eat();

        Penguin b3 = new Penguin("Penguin");
        Songbird b4 = new Songbird("SongBird");

        List<Flyable> flyingBirds = new ArrayList<>();
        flyingBirds.add(b1);
        flyingBirds.add(b2);

        System.out.println("#### Flying Birds");
        for (Flyable bird: flyingBirds) {
            bird.fly();
        }

    }
}