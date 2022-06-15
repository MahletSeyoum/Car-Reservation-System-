package edu.miu.cs590.notificationservice.domain;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@Component
public class PaymentKafkaListener {

    @KafkaListener(topics = "paymentnotifier", groupId = "groupId")
    void listener(String data) throws JsonProcessingException {
        PaymentRequest event = new ObjectMapper().readValue(data, PaymentRequest.class);
        System.out.println("Notification Sent: "+ event);
    }
}
