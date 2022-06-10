package com.titan.accountservice.service.impl;



import com.titan.accountservice.model.LoginRequest;
import com.titan.accountservice.model.LoginResponse;
import com.titan.accountservice.repository.UserRepository;
import com.titan.accountservice.security.Jwt.JwtUtil;
import com.titan.accountservice.service.UaaService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UaaServiceImpl implements UaaService {
    private final AuthenticationManager authenticationManager;
    private final UserDetailsService userDetailsService;
    private final JwtUtil jwtUtil;
    private final UserRepository userRepository;

    @Override
    public LoginResponse login(LoginRequest loginRequest) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword()));
        }catch (BadCredentialsException e){
            throw new Exception(e);
        }

        final UserDetails userDetails = userDetailsService.loadUserByUsername(loginRequest.getEmail());

        final String jwt = jwtUtil.generateToken(userDetails, userRepository.findByEmail(loginRequest.getEmail()).get());
        return new LoginResponse(jwt);
    }
}
