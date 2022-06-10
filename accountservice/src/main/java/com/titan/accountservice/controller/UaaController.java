package com.titan.accountservice.controller;



import com.titan.accountservice.model.LoginRequest;
import com.titan.accountservice.model.LoginResponse;
import com.titan.accountservice.service.UaaService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/login")
@CrossOrigin("*")
@AllArgsConstructor
public class UaaController {

    private final UaaService uaaService;

    @PostMapping
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) throws Exception {
        LoginResponse loginResponse = uaaService.login(loginRequest);
        return ResponseEntity.ok().body(loginResponse);
    }
}
