package io.swagger.infrastructure;

import io.swagger.model.Payment;

import java.util.List;

public interface PaymentRepository {

     Payment createPayment(Payment payment);
     List<Payment> getPayments();
     Payment getPaymentById(String paymentId);


    }
