package com.hellozo0.book.springboot.web.dto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter //선언된 모든 필드의 get메소드를 생성해 줍니다.
@RequiredArgsConstructor // 선언된 모든 final 필드가 포함된 생성자를 생성, (final 아닌 필드는 생성자에 포함X)
public class HelloResponseDto {

    private final String name;
    private final int amount;
}
