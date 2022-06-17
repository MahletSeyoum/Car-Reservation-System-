package edu.miu.cs590.reservationservice.controller;

import edu.miu.cs590.reservationservice.controller.request.ReservationRequest;
import edu.miu.cs590.reservationservice.dto.PaymentRequest;
import edu.miu.cs590.reservationservice.domain.Reservation;
import edu.miu.cs590.reservationservice.service.ReservationService;
import io.github.resilience4j.retry.annotation.Retry;
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

    @Retry(name = "vehicles", fallbackMethod = "hardcodedResponse")
    @PostMapping("/{vehicleId}")
    public Reservation createReservation(@RequestBody ReservationRequest reservationRequest, @PathVariable String vehicleId){
        return reservationService.addReservation(reservationRequest, vehicleId);
    }

    @DeleteMapping("/{id}")
    public void cancelReservation( @PathVariable String id ){
        reservationService.cancelReservation(id);
    }

    @GetMapping("/{id}")
    public Reservation getReservationById(@PathVariable String id){
        return reservationService.getReservationById(id);
    }

//    @PutMapping("/{id}")
//    public Reservation updateStatus(@PathVariable Long id, @RequestBody VehicleStatus status){
//        return reservationService.updateStatus(id, status);
//    }

    @Retry(name = "vehicles", fallbackMethod = "hardcodedResponseForPay")
    @PostMapping("/pay")
    public String pay(@RequestBody PaymentRequest paymentRequest){
        return reservationService.pay(paymentRequest);
    }

    public Reservation hardcodedResponse(Exception ex) {
        System.out.println("Trying");
        return null;
    }

    public String hardcodedResponseForPay(Exception ex) {
        System.out.println("Trying");
        return "Sorry! The service is down!";
    }
}
