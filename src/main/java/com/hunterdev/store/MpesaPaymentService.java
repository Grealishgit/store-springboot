package com.hunterdev.store;

public class MpesaPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Mpesa payment of Ksh " + amount);
        System.out.println("Payment processed successfully via Mpesa.");
    }
}