package com.observer;

public class Client {

    public static void main(String[] args) {
        Order order = new Order("100");
        PriceObserver price = new PriceObserver();

        order.attach(price);

        order.addItem(50);
        order.addItem(200);

        System.out.println(order);
    }
}
