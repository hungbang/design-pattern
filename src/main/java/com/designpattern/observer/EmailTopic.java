package com.designpattern.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by KAI on 4/9/18.
 */
public class EmailTopic implements Subject {

    private String message;
    private List<Observer> observers;

    public EmailTopic(List<Observer> observers) {
        this.observers = observers;
    }

    public EmailTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if(Objects.isNull(observer)) throw new NullPointerException("Null observer.");

        if(!observers.contains(observer))
            observers.add(observer);
    }

    @Override
    public void unRegister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update();
        }
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String msg){
        System.out.println("Message posted to my topic: "+ msg);
        this.message = msg;
        notifyObservers();
    }
}
