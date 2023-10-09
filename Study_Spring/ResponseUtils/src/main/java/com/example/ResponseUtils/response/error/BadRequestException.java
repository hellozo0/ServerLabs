package com.example.ResponseUtils.response.error;

public class BadRequestException extends RuntimeException{
    public BadRequestException(ErrorResponseStatus status){
        super(status.getMessage());
    }
}
