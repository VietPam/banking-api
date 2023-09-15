package com.quangviet.bankingapi.service.impl;

import com.quangviet.bankingapi.dto.EmailDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService{
    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String senderEmail;

    @Override
    public void sendEmailAlert(EmailDetail emailDetail) {
        try {
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setFrom(senderEmail);
            mailMessage.setTo(emailDetail.getRecipient());
            mailMessage.setText(emailDetail.getMessageBody());
            mailMessage.setSubject(emailDetail.getSubject());

            javaMailSender.send(mailMessage);
            System.out.println("Mail sent successfully");
        }catch (MailException e) {
                throw new RuntimeException(e);

        }
    }


}
