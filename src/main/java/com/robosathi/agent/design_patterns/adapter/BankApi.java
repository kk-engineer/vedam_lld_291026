package com.robosathi.agent.design_patterns.adapter;

public interface BankApi {
    void sendMoney(String from, String to, int amount);
    void registerUser(String accountNumber);
    void checkBalance(String accountNumber);
}
