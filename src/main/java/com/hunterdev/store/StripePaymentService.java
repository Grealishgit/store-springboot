package com.hunterdev.store;

public class StripePaymentService implements PaymentService {

    public void processPayment(double amount) {
        System.out.println("Processing Stripe payment of Ksh" + amount);
        System.out.println("Payment processed successfully via Stripe.");
    }
}
