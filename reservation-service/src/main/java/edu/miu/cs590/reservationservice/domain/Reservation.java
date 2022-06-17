package edu.miu.cs590.reservationservice.domain;

import edu.miu.cs590.reservationservice.dto.Account;
import edu.miu.cs590.reservationservice.dto.PaymentType;
import edu.miu.cs590.reservationservice.dto.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id
    private String id;
   // private String accountId;
    private ReservationStatus reservationStatus;

    private Account account;
//    @Embedded
    private Duration duration;

    private PaymentType paymentType;

//    @OneToOne(cascade = CascadeType.PERSIST)
//    @JoinColumn(name = "vehicleID")
    private Vehicle vehicle;


}
