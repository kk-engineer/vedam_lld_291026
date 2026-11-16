package com.robosathi.agent.design_patterns.adapter.third_party;

import com.robosathi.agent.design_patterns.adapter.third_party.icici_bank.IciciBank;

public class IciciBankAdapter implements BankApi{
    private IciciBank iciciBank = new IciciBank();
    @Override
    public void sendMoney(String from, String to, int amount) {
        iciciBank.makePayment(amount, to, from);
    }
}
