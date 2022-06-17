package edu.miu.cs590.reservationservice.domain;

import lombok.Data;

@Data
public class Account {
    private String id;
    private String email;

    public Account() {
    }
}
