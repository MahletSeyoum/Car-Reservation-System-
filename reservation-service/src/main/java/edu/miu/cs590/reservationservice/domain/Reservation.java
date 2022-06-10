package edu.miu.cs590.reservationservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationId;
    private String accountId;
    private String vehicleId;
    private Status status;
    @Embedded
    private Duration duration;
    private PaymentType paymentType;
    @OneToOne
    private Vehicle vehicle;
}
