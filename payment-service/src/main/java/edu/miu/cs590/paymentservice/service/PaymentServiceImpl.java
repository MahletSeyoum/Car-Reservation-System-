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
    public String makePayment(PaymentRequest request){
        request.setPaymentStatus(PaymentStatus.PAID);
        //request.setPaymentStatus(PaymentStatus.ERROR);
        paymentRepository.save(request);
        return "SUCCESSFUL";
    }
}
