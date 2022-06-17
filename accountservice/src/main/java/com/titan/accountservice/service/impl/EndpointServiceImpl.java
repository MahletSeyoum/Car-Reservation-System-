package com.titan.accountservice.service.impl;

import com.titan.accountservice.VO.reservation.ReservationRequestVO;
import com.titan.accountservice.VO.reservation.ReservationVO;
import com.titan.accountservice.VO.vehicle.VehicleVO;
import com.titan.accountservice.service.EndpointService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service
@RequiredArgsConstructor
public class EndpointServiceImpl implements EndpointService {

    private final RestTemplate restTemplate;
    @Override
    public List<VehicleVO> getAllVehicle() {

//        List<VehicleVO> vehicleVO =
//                 restTemplate
//                         .getForObject("http://localhost:9001/vehicles/",
//                                 VehicleVO.class);

        return null;
    }

    @Override
    public VehicleVO getVehicleById(String vehicleId) {
                VehicleVO vehicleVO =
                 restTemplate
                         .getForObject("http://localhost:9001/vehicles/getvehicle/" + vehicleId,
                                 VehicleVO.class);

                return  vehicleVO;
    }

    @Override
    public ReservationVO addReservation(ReservationRequestVO reservationRequest, String vehicleId) {
//



        ReservationVO reservationVO =
                restTemplate
                        .postForObject("http://localhost:9031/reservations/" + vehicleId, reservationRequest,
                                ReservationVO.class);

        return  reservationVO;
    }

    @Override
    public void cancelReservation(String reservationId) {
        restTemplate
                .delete("http://localhost:9031/reservations/" + reservationId);
    }


}
