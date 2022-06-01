package io.swagger.infrastructure;

import io.swagger.model.Payment;

import java.util.List;

public interface PaymentRepository {

    public void createPayment(Payment payment);
    public List<Payment> getPayments();
    public Payment getPaymentById(String paymentId);


    }
