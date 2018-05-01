package com.designpattern;

/**
 * Created by KAI on 4/8/18.
 */
public class Product {

    public int price;
    public String upcCode;

    public void setPrice(int price) {
        this.price = price;
    }

    public void setUpcCode(String upcCode) {
        this.upcCode = upcCode;
    }

    public Product(int price, String upcCode) {
        this.price = price;
        this.upcCode = upcCode;
    }
}
