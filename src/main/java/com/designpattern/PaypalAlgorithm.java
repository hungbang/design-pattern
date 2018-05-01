package com.designpattern;

/**
 * Created by KAI on 4/8/18.
 */
public class PaypalAlgorithm implements Payment{

    public String email;
    public String password;


    public PaypalAlgorithm(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void pay(int amount) {
        System.out.println(amount + " paid with paypal");
    }
}
