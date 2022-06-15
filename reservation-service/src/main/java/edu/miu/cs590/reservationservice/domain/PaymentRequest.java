package edu.miu.cs590.reservationservice.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class PaymentRequest {
    private String userId;
    private String reservationId;
    private ReservationStatus reservationStatus;
    private PaymentType paymentType;
    private Double totalPrice;
    private PaymentStatus paymentStatus;
}
