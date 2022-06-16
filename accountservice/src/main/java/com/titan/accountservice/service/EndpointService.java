package com.titan.accountservice.service;

import com.titan.accountservice.VO.reservation.ReservationRequestVO;
import com.titan.accountservice.VO.reservation.ReservationVO;
import com.titan.accountservice.VO.vehicle.VehicleVO;

import java.util.List;

public interface EndpointService {

    List<VehicleVO> getAllVehicle();
    VehicleVO getVehicleById (String vehicleId);
    ReservationVO addReservation(ReservationRequestVO reservationRequest, String vehicleId);

    void cancelReservation(String reservationId);

}
