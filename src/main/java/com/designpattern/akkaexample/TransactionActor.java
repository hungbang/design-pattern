package com.designpattern.akkaexample;

import akka.actor.AbstractActor;
import akka.actor.Props;
import scala.Int;

/**
 * Created by KAI on 4/29/18.
 */
public class TransactionActor extends AbstractActor {

    public String transactionId;


    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }


    public static Props props(String transactionId) {
        return Props.create(TransactionActor.class, () -> new TransactionActor(transactionId));
    }

    public TransactionActor(String transactionId) {
        this.transactionId = transactionId;
    }


    @Override
    public Receive createReceive() {

        return receiveBuilder().match(Integer.class, transactionId -> {
            System.out.println("receiver transactionid : " + transactionId + " from sender: "+ getSender());
            System.out.println("transaction id is passed when init actor : "+ this.getTransactionId());
        }).matchAny(o -> {
            System.out.println("asfasdfasdf");
            System.out.println("transaction id is passed when init actor : "+ this.getTransactionId());
        }).build();
    }


}
