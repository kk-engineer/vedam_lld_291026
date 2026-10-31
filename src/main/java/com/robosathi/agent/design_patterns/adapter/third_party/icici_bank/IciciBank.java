package com.robosathi.agent.design_patterns.adapter.third_party.icici_bank;

public class IciciBank {
    public void makePayment(int amount, String to , String from) {
        System.out.println("ICICI bank transferred amount Rs. " + amount + " from account " + from + " to account " + to );
    }
}
