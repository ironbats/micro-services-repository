package br.com.loja.dto;

import org.springframework.http.HttpStatus;

public class ResponseStatus {

    private String message;
    private HttpStatus httpStatus;
    private String stackTrace;

    public ResponseStatus(String message, HttpStatus httpStatus, String stackTrace){
        this.message=message;
        this.httpStatus=httpStatus;
        this.stackTrace=stackTrace;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public String getStackTrace() {
        return stackTrace;
    }
}
