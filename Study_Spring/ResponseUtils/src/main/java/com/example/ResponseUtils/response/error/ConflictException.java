package com.example.ResponseUtils.response.error;

public class ConflictException extends RuntimeException{
    public ConflictException(ErrorResponseStatus status){
        super(status.getMessage());
    }
}
