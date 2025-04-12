package com.bank.bankapp.controller;

import com.bank.bankapp.dto.BankRespose;
import com.bank.bankapp.dto.UserRequest;
import com.bank.bankapp.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public BankRespose createAccount(@RequestBody UserRequest userRequest) {
        return userService.createAccount(userRequest);
    }
}
