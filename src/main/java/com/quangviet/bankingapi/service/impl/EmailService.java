package com.quangviet.bankingapi.service.impl;

import com.quangviet.bankingapi.dto.EmailDetail;

public interface EmailService {
    void sendEmailAlert(EmailDetail emailDetail);
}
