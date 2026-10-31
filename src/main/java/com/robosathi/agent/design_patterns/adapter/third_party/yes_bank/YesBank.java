package com.robosathi.agent.design_patterns.adapter.third_party.yes_bank;

public class YesBank {
    public void transferMoney(String from, String to, int amount) {
        System.out.println("YES bank transferred amount Rs. " + amount + " from account " + from + " to account " + to );
    }
}