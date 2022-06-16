package com.titan.accountservice.VO.reservation;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationRequestVO {
    private AccountVO account;
    private DurationVO duration;
    private PaymentTypeVO paymentType;
}
