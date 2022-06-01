package io.swagger.service;

import io.swagger.infrastructure.PaymentRepository;
import io.swagger.model.Payment;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultPaymentService implements PaymentService{

    private PaymentRepository paymentRepository;

    @org.springframework.beans.factory.annotation.Autowired
    public DefaultPaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    @CachePut(value="Payment", key="#payment.id()")
    public Payment createPayment(Payment payment) {
        this.paymentRepository.createPayment(payment);
        return payment;
    }

    @Override
    @Cacheable(value="Payment")
    public List<Payment> getPayments() {
        return this.paymentRepository.getPayments();
    }

    @Override
    @Cacheable(value="Payment", key="#paymentId")
    public Payment getPaymentById(String paymentId) {
        return this.paymentRepository.getPaymentById(paymentId);
    }
}
