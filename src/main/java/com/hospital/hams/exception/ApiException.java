package com.hospital.hams.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;


@Data
@AllArgsConstructor
public class ApiException {
    private String message;
    private String details;
    private LocalDateTime timestamp;
}
