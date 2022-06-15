package edu.miu.cs590.reservationservice.service;


import edu.miu.cs590.reservationservice.controller.request.ReservationRequest;
import edu.miu.cs590.reservationservice.domain.PaymentRequest;
import edu.miu.cs590.reservationservice.domain.Reservation;

import java.util.List;

public interface ReservationService{

    Reservation addReservation(ReservationRequest reservationRequest, String accountId, String vehicleId);

    void cancelReservation(String reservationId);

    List<Reservation> getAllReservations();

    Reservation getReservationById(String reservationId);

//    Reservation updateStatus (Long reservationId, VehicleStatus status);

    String pay (PaymentRequest paymentRequest);

}
