package edu.miu.cs590.paymentservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String paymentType;
    //@Embedded
    private ReservationStatus reservationStatus;
    private String reservationId;
    private String accountId;
    private Double price;
    //@Embedded
    private PaymentStatus paymentStatus;

}
