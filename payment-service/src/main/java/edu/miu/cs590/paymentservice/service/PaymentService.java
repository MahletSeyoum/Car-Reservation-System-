package edu.miu.cs590.paymentservice.service;

import edu.miu.cs590.paymentservice.domain.PaymentRequest;

public interface PaymentService {
    PaymentRequest makePayment(PaymentRequest request);
}
