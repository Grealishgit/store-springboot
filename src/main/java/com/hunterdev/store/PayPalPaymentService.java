package com.hunterdev.store;

public class PayPalPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of Ksh" + amount);
        System.out.println("Payment processed successfully via PayPal.");
    }
    
}
