package com.state;

public class InTransit implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("Contacting courier services for cancellation.");
        System.out.println("Contacting payment gateway for transaction rollback.");
        return 20;
    }
}
