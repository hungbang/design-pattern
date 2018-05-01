package com.designpattern.observer;

/**
 * Created by KAI on 4/10/18.
 */
public class EmailTopicSubcriber implements Observer {

    private String name;

    private Subject topic;


    public EmailTopicSubcriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if (msg == null)
            System.out.println(name + " No new message on this topic!");
        else
            System.out.println(name + " Retrieving message  " + msg);
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
