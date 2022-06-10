package edu.miu.cs590.reservationservice.service;


import edu.miu.cs590.reservationservice.controller.request.ReservationRequest;
import edu.miu.cs590.reservationservice.domain.*;

import java.util.List;

public interface ReservationService{

    Reservation addReservation(ReservationRequest reservationRequest, String accountId);

    void cancelReservation(Long reservationId, Reservation reservation);

    List<Reservation> getAllReservations();

    Reservation getReservationById(Long reservationId);

    Reservation updateStatus (Long reservationId, Status status);

    String pay (PaymentRequest paymentRequest);

}
