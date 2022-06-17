package com.titan.accountservice.VO.vehicle;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class VehicleVO {

    private String id;

    private String vinNumber;

    private String plateNumber;

    private String brand;

    private String model;

    private String color;

    private Integer quantity;

    private String yearOfManufacture;

    private VehicleTypeVO vehicleType;

    private VehicleStatusVO vehicleStatus;

    private Double price;


}
