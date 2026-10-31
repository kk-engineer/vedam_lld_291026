package com.robosathi.agent.design_patterns.adapter;

import com.robosathi.agent.design_patterns.adapter.third_party.yes_bank.YesBank;

public class YesBankAdapter implements BankApi{
    private YesBank yesBank = new YesBank();

    @Override
    public void sendMoney(String from, String to, int amount) {
        yesBank.transferMoney(from, to, amount);
    }

    @Override
    public void registerUser(String accountNumber) {
    }

    @Override
    public void checkBalance(String accountNumber) {

    }
}
