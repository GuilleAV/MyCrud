package com.codigowilli.mycrud.handler;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ErrorResponse {

    private int code;
    private String message;
    private String cause;

    public ErrorResponse(int code, String message, String cause) {
        this.code = code;
        this.message = message;
        this.cause = cause;
    }
}
