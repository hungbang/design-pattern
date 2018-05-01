package com.designpattern;

/**
 * Created by KAI on 4/8/18.
 */
public class CreditCardAlgorithm implements Payment {

    public String name;
    public String cardNumber;

    public CreditCardAlgorithm(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    public void pay(int amount) {
        System.out.println(amount + " paid with credit card");
    }
}
