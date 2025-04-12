package com.bank.bankapp.service.impl;

import com.bank.bankapp.dto.BankRespose;
import com.bank.bankapp.dto.UserRequest;

public interface UserService {

    BankRespose createAccount(UserRequest userRequest);
}
