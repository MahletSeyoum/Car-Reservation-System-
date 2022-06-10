package com.titan.accountservice.service;


import com.titan.accountservice.model.LoginRequest;
import com.titan.accountservice.model.LoginResponse;

public interface UaaService {
    LoginResponse login (LoginRequest loginRequest) throws Exception;
}
