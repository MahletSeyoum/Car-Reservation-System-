package com.titan.accountservice.service.impl;


import com.titan.accountservice.dto.UserDto;
import com.titan.accountservice.entity.UserAccount;
import com.titan.accountservice.repository.UserRepository;
import com.titan.accountservice.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@AllArgsConstructor

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void add(UserAccount user) {
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        userRepository.save(user);
    }

    @Override
    public UserDto findUserById(String id) {
        UserDto userDto = new UserDto();

        Optional<UserAccount> user = userRepository.findById(id);

        UserAccount obtainedUser = user.get();

        userDto.setId(obtainedUser.getId());
        userDto.setFirstName(obtainedUser.getFirstname());
        userDto.setLastName(obtainedUser.getLastname());
        userDto.setEmail(obtainedUser.getEmail());

        return userDto;

    }
}
