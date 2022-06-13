package edu.miu.cs590.paymentservice.service;

import edu.miu.cs590.paymentservice.domain.PaymentRequest;
import edu.miu.cs590.paymentservice.domain.PaymentStatus;
import edu.miu.cs590.paymentservice.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PaymentServiceImpl implements PaymentService{

    @Autowired
    PaymentRepository paymentRepository;

    @Override
    public PaymentRequest makePayment(PaymentRequest request){
        request.setPaymentStatus(request.getPaymentStatus().PAID);
        return paymentRepository.save(request);
            }
}