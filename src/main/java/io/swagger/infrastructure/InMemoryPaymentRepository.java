package io.swagger.infrastructure;

import io.swagger.model.Payment;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class InMemoryPaymentRepository implements PaymentRepository{
    private final AtomicInteger counter = new AtomicInteger(0);
    private final Map<String, Payment> data = new HashMap<>();


    @Override
    public Payment createPayment(Payment payment) {
        return data.put(payment.getId(), payment);

    }

    @Override
    public Payment getPaymentById(String paymentId) {
        final Payment payment = data.get(paymentId);
        if (payment == null) {
            throw new RuntimeException("No payment for " + paymentId);
        }
        return payment;
    }

    @Override
    public List<Payment> getPayments() {
        return new ArrayList<>(data.values());
    }

}
