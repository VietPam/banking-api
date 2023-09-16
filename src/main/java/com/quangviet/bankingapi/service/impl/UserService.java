package com.quangviet.bankingapi.service.impl;

import com.quangviet.bankingapi.dto.BankResponse;
import com.quangviet.bankingapi.dto.EnquiryRequest;
import com.quangviet.bankingapi.dto.UserRequest;

public interface UserService {

    BankResponse createAccount(UserRequest userRequest);

    BankResponse balanceEnquiry(EnquiryRequest request);

    String nameEnquiry(EnquiryRequest request);


}
