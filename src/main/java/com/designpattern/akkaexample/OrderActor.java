package com.designpattern.akkaexample;

import akka.actor.AbstractActor;
import akka.actor.Props;

/**
 * Created by KAI on 4/29/18.
 */
public class OrderActor extends AbstractActor {

    public static Props props(String text){
        return Props.create(OrderActor.class, text);
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder().build();
    }
}
