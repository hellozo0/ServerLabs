package com.hellozo0.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //JSON으로 번환하는 컨트롤러를 만들어줌
public class HelloController {

    @GetMapping("/hello") //Get의 요청을 받을 수 있는 API를 만들어줌
    public String hello() {
        return "hello";
    }
}
