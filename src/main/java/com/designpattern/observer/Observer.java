package com.designpattern.observer;

import com.designpattern.observer.Subject;

/**
 * Created by KAI on 4/9/18.
 */
public interface Observer {

    public void update();

    public void setSubject(Subject subject);
}
