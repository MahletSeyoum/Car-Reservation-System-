package edu.miu.cs590.vehicleservice.service;

import edu.miu.cs590.vehicleservice.domain.Vehicle;
import edu.miu.cs590.vehicleservice.domain.VehicleStatus;

import java.util.List;

public interface VehicleService {
    List <Vehicle> getAllVehicle();

    List <Vehicle> getVehicleByBrand(String brand);

    List <Vehicle> getVehicleByModel(String model);

    Vehicle getVehicleById (String vehicleId);

    Vehicle addVehicle (Vehicle vehicle);

    Vehicle updateVehicle (String vehicleId , Vehicle vehicle);

    void deleteVehicle (String vehicleId);
    void updateVehicleStatus(String vehicleId, VehicleStatus vehicleStatus);

}
