package com.designpattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by KAI on 4/8/18.
 */
public class ShoppingCart {

    public List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

    public void pay(Payment payment){
        int amount = calculateTotal();
        payment.pay(amount);

    }

    public int calculateTotal(){
        int sum =0;
        for (Product product : products){
            sum  += product.price;
        }
        return sum;
    }
}
