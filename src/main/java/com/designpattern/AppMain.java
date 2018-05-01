package com.designpattern;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import com.designpattern.akkaexample.TransactionEntity;
import com.designpattern.akkaexample.TransactionActor;

/**
 * Created by KAI on 4/8/18.
 */
public class AppMain {
    public static void main(String[] args) {
//        ShoppingCart shoppingCart = new ShoppingCart();
//        Product pants = new Product(100, "234");
//        Product shirt = new Product(150, "123");
//
//
//        shoppingCart.addProduct(pants);
//        shoppingCart.addProduct(shirt);
//
//        shoppingCart.pay(new PaypalAlgorithm("quanhungbang@gmail.com", "Abc123"));
//        shoppingCart.pay(new CreditCardAlgorithm("Hung Bang", "4561235612357895"));


        //TODO: observer design pattern

//        EmailTopic emailTopic = new EmailTopic();
//
//        Observer observer1st = new EmailTopicSubcriber("First Observer");
//        Observer observer2nd = new EmailTopicSubcriber("Second Observer");
//        Observer observer3rd = new EmailTopicSubcriber("Third Observer");
//
//
//        emailTopic.register(observer1st);
//        emailTopic.register(observer2nd);
//        emailTopic.register(observer3rd);
//
//        observer1st.setSubject(emailTopic);
//        observer2nd.setSubject(emailTopic);
//        observer3rd.setSubject(emailTopic);
//
//        observer1st.update();
//
//        emailTopic.postMessage("Hello Observer !");

        ActorSystem actorSystem = ActorSystem.create("test-system");
        ActorRef actorRef = actorSystem.actorOf(TransactionActor.props("123456789"), "transaction-actor");
        actorRef.tell(new Integer(10), ActorRef.noSender());

    }
}
