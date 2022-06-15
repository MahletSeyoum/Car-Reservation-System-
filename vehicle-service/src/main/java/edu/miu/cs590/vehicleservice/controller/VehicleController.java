package edu.miu.cs590.vehicleservice.controller;

import edu.miu.cs590.vehicleservice.domain.Vehicle;
import edu.miu.cs590.vehicleservice.domain.VehicleStatus;
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
    @GetMapping("getvehicle/{id}")
    public Vehicle getVehicleById(@PathVariable String id) {
        Vehicle vehicle = vehicleService.getVehicleById(id);
        return vehicle;

    }

    @GetMapping("getvehiclebybrand/{brand}")
    public List<Vehicle> getVehicleByBrand(@PathVariable String brand) {
        List<Vehicle> vehicle = vehicleService.getVehicleByBrand(brand);
        return vehicle;

    }

    @GetMapping("getvehiclebymodel/{model}")
    public List<Vehicle> getVehicleByModel(@PathVariable String model) {
        List<Vehicle> vehicle = vehicleService.getVehicleByModel(model);
        return vehicle;

    }

    @PostMapping
    public ResponseEntity<?> addVehicle( @RequestBody Vehicle vehicle){
        Vehicle newVehicle = vehicleService.addVehicle(vehicle);
        if (newVehicle == null)
            return new ResponseEntity<>("Already Exists", HttpStatus.OK);
        return new ResponseEntity<>(newVehicle, HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<?>updateVehicle(@PathVariable String id , @RequestBody Vehicle vehicleBody){
        return ResponseEntity.ok(vehicleService.updateVehicle(id ,vehicleBody));

    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?>deleteVehicle(@PathVariable String id){
        vehicleService.deleteVehicle(id);
        return ResponseEntity.ok("Successful");

    }

    @PutMapping("/update-status/{id}")
    public ResponseEntity<?> updateVehicleStatus(@PathVariable String id, @RequestBody VehicleStatus vehicleStatus){
        vehicleService.updateVehicleStatus(id, vehicleStatus);
        return ResponseEntity.noContent().build();
    }


}
