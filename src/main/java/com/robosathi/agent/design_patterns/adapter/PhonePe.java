package com.robosathi.agent.design_patterns.adapter;

public class PhonePe {
    private BankApi bankApi = new IciciBankAdapter();

    public void sendMoney(String from, String to, int amount) {
        bankApi.sendMoney(from, to, amount);
    }
}
