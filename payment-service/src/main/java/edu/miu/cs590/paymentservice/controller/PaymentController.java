package edu.miu.cs590.paymentservice.controller;

import edu.miu.cs590.paymentservice.domain.PaymentRequest;
import edu.miu.cs590.paymentservice.dto.PaymentRequestDTO;
import edu.miu.cs590.paymentservice.dto.adapters.PaymentReqToDTOAdapter;
import edu.miu.cs590.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @Autowired
    KafkaTemplate<String, PaymentRequestDTO> kafkaTemplate;

    public PaymentController(KafkaTemplate<String, PaymentRequestDTO> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    public PaymentRequest processPayment(@RequestBody PaymentRequest request) {
        PaymentRequest paymentRequest=paymentService.makePayment(request);
        PaymentRequestDTO paymentRequestDTO=PaymentReqToDTOAdapter.createPaymentRequestDTO(paymentRequest);
        kafkaTemplate.send("paymentnotifier", paymentRequestDTO);
        return paymentRequest;
    }
}
