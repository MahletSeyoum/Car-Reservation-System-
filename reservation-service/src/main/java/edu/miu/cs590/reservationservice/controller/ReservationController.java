package edu.miu.cs590.reservationservice.controller;

import edu.miu.cs590.reservationservice.controller.request.ReservationRequest;
import edu.miu.cs590.reservationservice.domain.*;
import edu.miu.cs590.reservationservice.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController {


    @Qualifier("reservationServiceImpl")
    @Autowired
    ReservationService reservationService;

    @GetMapping
    public List<Reservation> getAllReservations(){
        return reservationService.getAllReservations();
    }

    @PostMapping("/{accountId}/{vehicleId}")
    public Reservation createReservation(@RequestBody ReservationRequest reservationRequest, @PathVariable String accountId, @PathVariable Long vehicleId){
        return reservationService.addReservation(reservationRequest,accountId, vehicleId);
    }

    @DeleteMapping("/{id}")
    public void cancelReservation( @PathVariable Long id ){
        reservationService.cancelReservation(id);
    }

    @GetMapping("/{id}")
    public Reservation getReservationById(@PathVariable Long id){
        return reservationService.getReservationById(id);
    }

//    @PutMapping("/{id}")
//    public Reservation updateStatus(@PathVariable Long id, @RequestBody VehicleStatus status){
//        return reservationService.updateStatus(id, status);
//    }

    @PostMapping("/pay")
    public String pay(@RequestBody PaymentRequest paymentRequest){
        return reservationService.pay(paymentRequest);
    }

}
