package com.emailsender.api.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class EmailForm {

    @NotEmpty
    private String to;
    @NotEmpty
    private String subject;
    @NotEmpty
    private String text;
}
