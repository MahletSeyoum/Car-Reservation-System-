package com.titan.accountservice.VO.reservation;

import com.titan.accountservice.VO.vehicle.VehicleStatusVO;
import com.titan.accountservice.VO.vehicle.VehicleTypeVO;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;



@Document
@Data
@Setter
@Getter
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

    private Double Price;

}
