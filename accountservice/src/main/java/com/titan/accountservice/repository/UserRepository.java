package com.titan.accountservice.repository;


import com.titan.accountservice.entity.UserAccount;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository

public interface UserRepository extends MongoRepository<UserAccount, String> {
    Optional<UserAccount> findByEmail(String email);
}
