package com.designpattern.observer;

/**
 * Created by KAI on 4/9/18.
 */
public interface Subject {
    void register(Observer observer);
    void unRegister(Observer observer);
    void notifyObservers();
    Object getUpdate(Observer observer);

}
