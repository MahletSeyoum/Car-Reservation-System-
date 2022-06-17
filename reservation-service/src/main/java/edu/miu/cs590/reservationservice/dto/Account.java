package edu.miu.cs590.reservationservice.dto;

import lombok.Data;

@Data
public class Account {
    private String id;
    private String email;

    public Account() {
    }
}
