package com.hellozo0.book.springboot.web;

import com.hellozo0.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController  //JSON으로 번환하는 컨트롤러를 만들어줌
public class HelloController {

    @GetMapping("/hello") //Get의 요청을 받을 수 있는 API를 만들어줌
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new HelloResponseDto(name,amount);
        //RequestParam : 외부에서 API로 넘긴 파라미터를 가져오는 어노테이션
        // 외부에서 name (@requestParam("name"))이란 이름으로 넘긴 파라미터를 메소드 파라미터 name(String name)에 저장하게 된다.

    }
}
