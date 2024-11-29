package com.emailsender.api.controllers;

import com.emailsender.api.dto.EmailForm;
import com.emailsender.api.services.EmailService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EmailController {

    private final EmailService service;

    @PostMapping("/api/v1/send-email")
    public void sendEmail(@RequestBody @Valid EmailForm form) {
        service.sendEmail(form);
    }
}

