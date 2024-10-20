package com.state;

public class New implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("It's a new order, no processing done.");
        return 0;
    }
}
