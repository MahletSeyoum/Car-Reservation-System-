package edu.miu.cs590.vehicleservice.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Vehicle {

    @Id
    private String id;

    private String vinNumber;

    private String plateNumber;

    private String brand;

    private String model;

    private String color;

    private Integer quantity;

    private String yearOfManufacture;

    private VehicleType vehicleType;

    private VehicleStatus vehicleStatus;

    private Double price;





}
