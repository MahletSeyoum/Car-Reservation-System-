package edu.miu.cs590.reservationservice.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class PaymentRequest {
    private Long userId;
    private Long reservationId;
    private Status status;
    private PaymentType paymentType;
    private Double totalPrice;
    private PaymentStatus paymentStatus;
}
