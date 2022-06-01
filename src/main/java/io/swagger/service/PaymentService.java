package io.swagger.service;

import io.swagger.model.Payment;

import java.util.List;

public interface PaymentService {

     Payment createPayment(Payment payment);
     List<Payment> getPayments();
     Payment getPaymentById(String paymentId);

}
