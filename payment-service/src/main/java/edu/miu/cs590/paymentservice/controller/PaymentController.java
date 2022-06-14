package edu.miu.cs590.paymentservice.controller;

import edu.miu.cs590.paymentservice.domain.PaymentRequest;
import edu.miu.cs590.paymentservice.domain.serializers.PaymentRequestSerializer;
import edu.miu.cs590.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @Autowired
    KafkaTemplate<String, PaymentRequest> kafkaTemplate;

    public PaymentController(KafkaTemplate<String, PaymentRequest> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    public PaymentRequest processPayment(@RequestBody PaymentRequest request) {
        return paymentService.makePayment(request);
    }

    @PostMapping("/message")
    public void publish(@RequestBody PaymentRequest request){
        //System.out.println("aaaaaaaaa "+ request);
        kafkaTemplate.send("paymentnotifier", request);
    }


}
