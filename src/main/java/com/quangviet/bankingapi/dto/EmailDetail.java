package com.quangviet.bankingapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmailDetail {
    private String recipient;
    private String messageBody;
    private String subject;
    private String attachment;
}
