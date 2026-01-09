package com.hunterdev.store;

import org.springframework.stereotype.Component;

@Component
public class OrderService {


    private PaymentService paymentService;

    // public OrderService(PaymentService paymentService) {
    // this.paymentService=paymentService;
    // }

    public void placeOrder() {

        paymentService.processPayment(100);
        System.out.println("Order placed successfully.");
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}

