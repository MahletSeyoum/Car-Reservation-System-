package edu.miu.cs590.paymentservice.controller;

import edu.miu.cs590.paymentservice.domain.PaymentRequest;
import edu.miu.cs590.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @PostMapping
    public String processPayment(@RequestBody PaymentRequest orderPayment) {
        return paymentService.makePayment(orderPayment);
    }


}
