package com.example.ResponseUtils.response.error;

public class UnauthorizedException extends RuntimeException{
    public UnauthorizedException(ErrorResponseStatus status){
        super(status.getMessage());
    }
}
