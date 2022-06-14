package edu.miu.cs590.vehicleservice.service;

import edu.miu.cs590.vehicleservice.domain.Vehicle;

import java.util.List;

public interface VehicleService {
    List <Vehicle> getAllVehicle();

    List <Vehicle> getVehicleByBrand(String brand);

    List <Vehicle> getVehicleByModel(String model);

    Vehicle getVehicleById (Long vehicleId);

    Vehicle addVehicle (Vehicle vehicle);

    Vehicle updateVehicle (Long vehicleId , Vehicle vehicle);

   void deleteVehicle (Long vehicleId);

}
