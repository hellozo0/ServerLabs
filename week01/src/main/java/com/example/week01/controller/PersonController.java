package com.example.week01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/myinfo")
    public Person getPerson() {
        Person person = new Person();
        person.setName("hjelloo0");
        person.setAge(23);
        person.setAddress("seoul");
        return person;
    }

}
