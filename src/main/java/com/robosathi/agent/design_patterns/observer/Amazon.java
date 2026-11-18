package com.robosathi.agent.design_patterns.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow;

public class Amazon implements Publisher{
    private List<Subscriber> subscribers = new ArrayList<>();
    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber: subscribers) {
            subscriber.update();
        }
    }

    public void orderPlaced() {
        System.out.println("Order has been placed.");
        notifySubscribers();
    }
}
