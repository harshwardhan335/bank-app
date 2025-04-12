package com.bank.bankapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BankRespose {
    private String responseCode;
    private String responseMessage;
    private AccountInfo accountInfo;
}
