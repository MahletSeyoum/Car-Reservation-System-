package edu.miu.cs590.reservationservice.controller.request;

import edu.miu.cs590.reservationservice.domain.Duration;
import edu.miu.cs590.reservationservice.domain.PaymentType;
import edu.miu.cs590.reservationservice.domain.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationRequest {
    private Duration duration;
//    private Vehicle vehicle;
    private PaymentType paymentType;
}
