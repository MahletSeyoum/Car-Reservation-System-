package com.titan.accountservice.controller;



import com.titan.accountservice.dto.UserDto;
import com.titan.accountservice.entity.UserAccount;
import com.titan.accountservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<?> save (@RequestBody UserAccount user) throws Exception{
        userService.add(user);

        return ResponseEntity.ok().body("");
    }

    @GetMapping("/{id}")
    public UserDto findUserById(@PathVariable String id){
        return userService.findUserById(id);
    }
}
