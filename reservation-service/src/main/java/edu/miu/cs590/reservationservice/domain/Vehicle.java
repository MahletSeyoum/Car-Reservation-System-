package edu.miu.cs590.reservationservice.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
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

    private Double Price;

}
