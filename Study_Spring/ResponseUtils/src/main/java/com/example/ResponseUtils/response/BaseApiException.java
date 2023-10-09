package com.example.ResponseUtils.response;

import com.example.ResponseUtils.response.error.ErrorResponseStatus;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class BaseApiException {

    private Integer status;
    private String message;

    public BaseApiException(ErrorResponseStatus status){
        this.status = status.getCode().value();
        this.message = status.getMessage();
    }

    public BaseApiException(HttpStatus code, String message){
        this.status = code.value();
        this.message = message;
    }

}