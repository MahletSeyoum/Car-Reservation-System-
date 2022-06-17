package edu.miu.cs590.reservationservice.controller.request;

import edu.miu.cs590.reservationservice.dto.Account;
import edu.miu.cs590.reservationservice.domain.Duration;
import edu.miu.cs590.reservationservice.dto.PaymentType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationRequest {
    private Account account;
    private Duration duration;
    private PaymentType paymentType;
}
