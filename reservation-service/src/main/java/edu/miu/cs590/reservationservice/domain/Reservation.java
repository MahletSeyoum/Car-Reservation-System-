package edu.miu.cs590.reservationservice.domain;

import lombok.*;

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
    private ReservationStatus reservationStatus;
    @Embedded
    private Duration duration;
    private PaymentType paymentType;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "vehicleID")
    private Vehicle vehicle;

}
