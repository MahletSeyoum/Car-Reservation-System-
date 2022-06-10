package com.titan.accountservice.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDto {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
}
