package com.emailsender.api.services;

import com.emailsender.api.dto.EmailForm;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {

    private final JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String email;

    public void sendEmail(@Valid EmailForm form) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(form.getTo());
        message.setSubject(form.getSubject());
        message.setText(form.getText());
        message.setFrom(email);

        mailSender.send(message);
    }
}
