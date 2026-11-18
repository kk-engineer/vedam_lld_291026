package com.robosathi.agent.design_patterns.observer;

public class Client {
    public static void main(String[] args){
        demoObserver();
    }

    private static void demoObserver() {
        Amazon amazon = new Amazon();

        Subscriber inventoryService = new InventoryService();
        Subscriber emailService = new EmailService();
        Subscriber logisticService = new LogisticService();

        //subscribe for notifications
        amazon.subscribe(inventoryService);
        amazon.subscribe(emailService);
        amazon.subscribe(logisticService);

        // notify all subscribers
        amazon.orderPlaced();
    }
}
