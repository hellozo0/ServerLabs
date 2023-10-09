package com.example.ResponseUtils.response.error;

public class NotFoundException extends RuntimeException{
    public NotFoundException(ErrorResponseStatus status){
        super(status.getMessage());
    }
}
