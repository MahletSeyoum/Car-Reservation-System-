package edu.miu.cs590.reservationservice.controller;

import edu.miu.cs590.reservationservice.domain.*;
import edu.miu.cs590.reservationservice.service.ReservationService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ReservationController.class)
@AutoConfigureMockMvc
public class ReservationControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    @Qualifier("reservationServiceImpl")
    ReservationService reservationService;

    @Test
    public void testGetAllReservations() {
    }

    @Test
    public void testCreateReservation() {
    }

    @Test
    public void testCancelReservation() {
    }

    @Test
    public void testGetReservationById() throws Exception {
        Mockito.when(reservationService.getReservationById(123L))
                .thenReturn(new Reservation(123L, "123",
                        ReservationStatus.RESERVED,
                        new Duration(),
                        PaymentType.BANK,
                        new Vehicle()));
        mockMvc.perform(MockMvcRequestBuilders.get("/reservations/123"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.reservationId").value(123L))
                .andExpect(MockMvcResultMatchers.jsonPath("$.accountId").value("123"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.reservationStatus").value("RESERVED"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.duration").value(new Duration()))
                .andExpect(MockMvcResultMatchers.jsonPath("$.paymentType").value("BANK"));
//                .andExpect(MockMvcResultMatchers.jsonPath("$.vehicle").value(new Vehicle(null, null, null, null, null, null, null, null, null, null, null)));


    }

    @Test
    public void testPay() {
    }
}