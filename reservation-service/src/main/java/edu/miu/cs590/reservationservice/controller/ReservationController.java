package edu.miu.cs590.reservationservice.controller;

import edu.miu.cs590.reservationservice.controller.request.ReservationRequest;
import edu.miu.cs590.reservationservice.domain.*;
import edu.miu.cs590.reservationservice.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    @Autowired
    ReservationService reservationService;

    @GetMapping
    public List<Reservation> getAllReservations(){
        return reservationService.getAllReservations();
    }

    @PostMapping("/{id}")
    public Reservation createReservation(@RequestBody ReservationRequest reservationRequest, @PathVariable String id){
        return reservationService.addReservation(reservationRequest ,id);
    }

    @DeleteMapping("/{id}")
    public void cancelReservation(@RequestBody Reservation reservation, @PathVariable Long id ){
        reservationService.cancelReservation(id, reservation);
    }

    @GetMapping("/{id}")
    public Reservation getReservationById(@PathVariable Long id){
        return reservationService.getReservationById(id);
    }

    @PutMapping("/{id}")
    public Reservation updateStatus(@PathVariable Long id, @RequestBody Status status){
        return reservationService.updateStatus(id, status);
    }

    @PostMapping
    public String pay(@RequestBody PaymentRequest paymentRequest){
        return reservationService.pay(paymentRequest);
    }

}
