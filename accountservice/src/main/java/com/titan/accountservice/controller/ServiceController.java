package com.titan.accountservice.controller;


import com.titan.accountservice.VO.reservation.ReservationRequestVO;
import com.titan.accountservice.VO.reservation.ReservationVO;
import com.titan.accountservice.VO.vehicle.VehicleVO;
import com.titan.accountservice.service.EndpointService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/services")
@RequiredArgsConstructor
public class ServiceController {

    private final EndpointService endpointService;

    @GetMapping("/vehicles")
    public ResponseEntity<?> getAllVehicle() {
        List<VehicleVO> vehicles = endpointService.getAllVehicle();
        return ResponseEntity.ok(vehicles);
    }

    @GetMapping("/vehicles/{id}")
    public ResponseEntity<?> getAllVehicleById(@PathVariable String id) {
        //VehicleVO vehicle = endpointService.getVehicleById("62aa03c5d3b569607186f273");
        VehicleVO vehicle = endpointService.getVehicleById(id);
        return ResponseEntity.ok(vehicle);

    }

    @PostMapping("/reservations/{vehicleId}")
    public ReservationVO createReservation(@RequestBody ReservationRequestVO reservationRequest, @PathVariable String vehicleId){
        return endpointService.addReservation(reservationRequest, vehicleId);
    }

    @DeleteMapping("/reservations/{id}")
    public void cancelReservation( @PathVariable String id ){
        endpointService.cancelReservation(id);
    }

}
