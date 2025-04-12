package com.bank.bankapp.utils;

import java.time.Year;

public class AccountUtils {

    public static final String ACCOUNT_EXISTS_CODE="001";
    public static final String ACCOUNT_EXISTS_MESSAGE="Account already exists";
    public static final String ACCOUNT_CREATION_SUCCESS="002";
    public static final String ACCOUNT_CREATION_MESSAGE="Account created successfully";

    public static String generateAccountNumber() {
        /*
    2025 + random six digit number
     */
        Year currentYear = Year.now();
        int min=100000;
        int max=999999;
        // Generate a random number between 100000 and 999999
        int randNUmber = (int) Math.floor(Math.random() * (max - min + 1) + min);

        //convert current year to string and random number to string then concatenate
        String year = String.valueOf(currentYear);
        String randomNumber = String.valueOf(randNUmber);
        StringBuilder accountNumber = new StringBuilder();
        return accountNumber.append(year).append(randomNumber).toString();

    }

}
