package com.titan.accountservice.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document
public class LoginRequest {
    private String email;
    private String password;
}
