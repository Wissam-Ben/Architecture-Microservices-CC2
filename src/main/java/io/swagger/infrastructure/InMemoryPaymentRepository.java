package io.swagger.infrastructure;

import io.swagger.model.Payment;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class InMemoryPaymentRepository implements PaymentRepository{
    private final AtomicInteger counter = new AtomicInteger(0);
    private final Map<String, Payment> data = new ConcurrentHashMap<>();


    public void createPayment(Payment payment) {
        data.put(payment.getId(), payment);

    }

    public Payment getPaymentById(String paymentId) {
        final Payment user = data.get(paymentId);
        if (user == null) {
            throw new RuntimeException("No user for " + paymentId);
        }
        return user;
    }

    public List<Payment> getPayments() {
        return new ArrayList<>(data.values());
    }

}
