package com.bank.bankapp.service.impl;

import com.bank.bankapp.dto.BankRespose;
import com.bank.bankapp.dto.CreditDebitRequest;
import com.bank.bankapp.dto.EnquiryRequest;
import com.bank.bankapp.dto.UserRequest;

public interface UserService {

    BankRespose createAccount(UserRequest userRequest);

    BankRespose balanceEnquiry(EnquiryRequest request);

    String nameEnquiry(EnquiryRequest request);

    BankRespose creditAccount(CreditDebitRequest request);

    BankRespose debitAccount(CreditDebitRequest request);
}
