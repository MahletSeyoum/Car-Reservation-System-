package com.titan.accountservice.VO.reservation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationVO {

    private String id;
   // private String accountId;
    private ReservationStatusVO reservationStatus;

    AccountVO account;
//    @Embedded
    private DurationVO duration;
    private PaymentTypeVO paymentType;

//    @OneToOne(cascade = CascadeType.PERSIST)
//    @JoinColumn(name = "vehicleID")
    private VehicleVO vehicle;

}
