package com.example.ResponseUtils.response;

//import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class BaseApiResponseNonData<T> {

//    @ApiModelProperty(example = "상태 코드")
    private Integer status;

//    @ApiModelProperty(example = "상태 메세지")
    private String message;

    public BaseApiResponseNonData(String message){
        this.status = HttpStatus.OK.value();
        this.message = message;
    }
}