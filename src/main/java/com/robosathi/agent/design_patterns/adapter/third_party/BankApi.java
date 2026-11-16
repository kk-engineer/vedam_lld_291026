package com.robosathi.agent.design_patterns.adapter.third_party;

public interface BankApi {
    void sendMoney(String from, String to, int amount);
}
