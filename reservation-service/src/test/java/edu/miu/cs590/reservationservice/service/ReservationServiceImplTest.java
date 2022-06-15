package edu.miu.cs590.reservationservice.service;

import edu.miu.cs590.reservationservice.domain.*;
import edu.miu.cs590.reservationservice.repository.ReservationRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
public class ReservationServiceImplTest {

    @TestConfiguration
    static class ReservationServiceImplContextConfiguration {

        @Bean
        ReservationService getReservationService() {

            return new ReservationServiceImpl();
        }
    }

    @Autowired
    ReservationServiceImpl reservationService;

    @MockBean
    RestTemplate restTemplate;

    @MockBean
    ReservationRepository reservationRepository;

    @Before
    public void setUp() throws Exception {
        Long reservationId = 123L;
        Vehicle vehicle = new Vehicle();
        Duration duration = new Duration();
        Reservation reservation = new Reservation(reservationId, "123", ReservationStatus.RESERVED, duration, PaymentType.BANK,vehicle);
        Optional<Reservation> optionalReservation = Optional.of(reservation);

        Mockito.when(reservationRepository.findById(reservationId)).thenReturn(optionalReservation);
//        Mockito.when(reservationRepository.findId(reservationId)).thenReturn(optionalReservation);

    }


    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testAddReservation() {
    }

    @Test
    public void testCancelReservation() {

    }

    @Test
    public void testGetAllReservations() {

    }

    @Test
    public void testGetReservationById() {
        Long reservationId = 123L;
        Reservation reservation = reservationService.getReservationById(reservationId);

        assertThat(reservation.getReservationId())
                .isEqualTo(reservationId);

    }

    @Test
    public void testPay() {
    }
}