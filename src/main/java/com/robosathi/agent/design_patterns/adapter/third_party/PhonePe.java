package com.robosathi.agent.design_patterns.adapter.third_party;

public class PhonePe {
    private BankApi bankApi = new IciciBankAdapter();

    public void sendMoney(String from, String to, int amount) {
        bankApi.sendMoney(from, to , amount);
    }
}
