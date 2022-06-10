package edu.miu.cs590.paymentservice.service;

import edu.miu.cs590.paymentservice.domain.PaymentRequest;

public interface PaymentService {
    String makePayment(PaymentRequest request);
}
