package edu.miu.cs590.notificationservice.domain.deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.miu.cs590.notificationservice.domain.PaymentRequest;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

public class PaymentRequestDeserializer implements Deserializer {

    @Override
    public void configure(Map configs, boolean isKey) {
        Deserializer.super.configure(configs, isKey);
    }

    @Override
    public PaymentRequest deserialize(String arg0, byte[] arg1) {
        ObjectMapper mapper = new ObjectMapper();
        PaymentRequest request = null;
        try {
            request = mapper.readValue(arg1, PaymentRequest.class);
        } catch (Exception e) {

            e.printStackTrace();
        }
        return request;
    }


    @Override
    public Object deserialize(String topic, Headers headers, byte[] data) {
        return Deserializer.super.deserialize(topic, headers, data);
    }

    @Override
    public void close() {
        Deserializer.super.close();
    }


}
