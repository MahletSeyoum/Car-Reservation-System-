package com.titan.accountservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class UserAccount {
    @Id

    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String role;


}
