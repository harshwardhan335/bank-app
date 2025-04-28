package com.bank.bankapp.controller;

import com.bank.bankapp.dto.BankRespose;
import com.bank.bankapp.dto.CreditDebitRequest;
import com.bank.bankapp.dto.EnquiryRequest;
import com.bank.bankapp.dto.UserRequest;
import com.bank.bankapp.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public BankRespose createAccount(@RequestBody UserRequest userRequest) {
        return userService.createAccount(userRequest);
    }

    @GetMapping("balanceEnquiry")
    public BankRespose balanceEnquiry(@RequestBody EnquiryRequest request) {
        return userService.balanceEnquiry(request);
    }
    @GetMapping("nameEnquiry")
    public String nameEnquiry(@RequestBody EnquiryRequest request) {
        return userService.nameEnquiry(request);
    }

    @PostMapping("credit")
    public BankRespose creditAccount(@RequestBody CreditDebitRequest request) {
        return userService.creditAccount(request);
    }
    @PostMapping("debit")
    public BankRespose debitAccount(@RequestBody CreditDebitRequest request) {
        return userService.debitAccount(request);
    }
}
