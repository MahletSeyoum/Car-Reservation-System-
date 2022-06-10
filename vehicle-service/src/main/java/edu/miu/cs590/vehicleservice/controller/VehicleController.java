package edu.miu.cs590.vehicleservice.controller;

import edu.miu.cs590.vehicleservice.domain.Vehicle;
import edu.miu.cs590.vehicleservice.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    //Get all the vehicles
    @GetMapping
    public ResponseEntity<?> getAllVehicle() {
        List<Vehicle> vehicles = vehicleService.getAllVehicle();
        return ResponseEntity.ok(vehicles);
//        return ResponseEntity.ok("Hello");
    }

    //Get the vehicles by id
    @GetMapping("/{id}")
    public ResponseEntity<?> getVehicleById(@PathVariable Long id) {
        Vehicle vehicle = vehicleService.getVehicleById(id);
        return ResponseEntity.ok(vehicle);

    }

    @PostMapping
    public ResponseEntity<?> addVehicle( @RequestBody Vehicle vehicle){
        Vehicle newVehicle = vehicleService.addVehicle(vehicle);
        if (newVehicle == null)
            return new ResponseEntity<>("Already Exists", HttpStatus.OK);
        return new ResponseEntity<>(newVehicle, HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<?>updateVehicle(@PathVariable Long id , @RequestBody Vehicle vehicleBody){
        return ResponseEntity.ok(vehicleService.updateVehicle(id ,vehicleBody));

    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?>deleteVehicle(@PathVariable Long id){
        vehicleService.deleteVehicle(id);
        return ResponseEntity.ok("Successful");
    }




}
