package com.designpattern.akkaexample;

import java.io.Serializable;

/**
 * Created by KAI on 4/30/18.
 */
public class TransactionEntity implements Serializable{

    private String tx1;

    public TransactionEntity() {
    }

    public TransactionEntity(String tx1) {
        this.tx1 = tx1;
    }

    public String getTx1() {
        return tx1;
    }

    public void setTx1(String tx1) {
        this.tx1 = tx1;
    }
}
