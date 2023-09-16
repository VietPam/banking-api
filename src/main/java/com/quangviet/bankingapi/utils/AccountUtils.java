package com.quangviet.bankingapi.utils;

import java.time.Year;

import static java.lang.Math.random;

public class AccountUtils {
    public static final String ACCOUNT_EXIST_CODE="001";
    public static final String ACCOUNT_EXIST_MESSAGE="This user already has an account created!";
    public static final String ACCOUNT_CREATION_MESSAGE = "Account has been successfully created";
    public static final String ACCOUNT_CREATION_CODE = "002";
    public static final String ACCOUNT_NOT_EXIST_CODE ="003";
    public static final String ACCOUNT_NOT_EXIST_MESSAGE="User with the provided Account number does not exist";
    public static final String ACCOUNT_FOUND_CODE="004";
    public static final String ACCOUNT_FOUND_MESSAGE="User Account found";
    public static final String ACCOUNT_CREDITED_SUCCESS="005";
    public static final String ACCOUNT_CREDITED_MESSAGE="User Account was credited successfully";
    public static final String INSUFFICIENT_BALANCE_CODE="006";
    public static final String INSUFFICIENT_BALANCE_MESSAGE="Insufficient Balance";
    public static final String ACCOUNT_DEBITED_SUCCESS="007";
    public static final String ACCOUNT_DEBITED_MESSAGE="Account has been successfully debited";

    public static String generateAccountNumber(){



        /**
         * 2023 + randomSixDigits
         * 2023123456
         */
        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;

        //generate a random number between min and max
        int randNumber= (int)Math.floor(random()*(max - min + 1)+min);
        //convert the current and randomNumber to strings, then concatenate them

        String year = String.valueOf(currentYear);
        String randomNumber =String.valueOf(randNumber);

        StringBuilder accountNumber = new StringBuilder();

        return accountNumber.append(year).append(randomNumber).toString();
    }

}
