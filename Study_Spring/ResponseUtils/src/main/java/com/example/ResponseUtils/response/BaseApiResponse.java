package com.example.ResponseUtils.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
public class BaseApiResponse<T> {

//    @ApiModelProperty(example = "상태 코드")
    private Integer status;

//    @ApiModelProperty(example = "상태 메세지")
    private String message;

//    @ApiModelProperty(example = "전달할 데이터")
    private T data;

    public BaseApiResponse(String message, T data){
        this.status = HttpStatus.OK.value();
        this.message = message;
        this.data = data;
    }
}