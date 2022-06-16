package com.titan.accountservice.service;


import com.titan.accountservice.dto.UserDto;
import com.titan.accountservice.entity.UserAccount;

public interface UserService {
    void add(UserAccount user);
    UserDto findUserById(String id);


}
