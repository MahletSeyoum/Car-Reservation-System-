package edu.miu.cs590.vehicleservice.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String vinNumber;

    private String plateNumber;

    private String brand;

    private String model;

    private String color;

    private Integer quantity;

    private String yearOfManufacture;

    private VehicleType vehicleType;
    
    @Enumerated
    private VehicleStatus vehicleStatus;

    private Double price;

}
