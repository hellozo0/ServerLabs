package com.example.week01.controller;

import com.example.week01.models.PersonRequestDto;
import com.example.week01.repository.PersonRepository;
import com.example.week01.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PersonController {

    private final PersonRepository personRepository;
    private final PersonService personService;

//    @GetMapping("/myinfo")
//    public Person getPerson() {
//        Person person = new Person();
//        person.setName("hjelloo0");
//        person.setAge(23);
//        person.setAddress("seoul");
//        return person;
//    }

    @PostMapping("/api/persons")
    public Person postPerson(@RequestBody PersonRequestDto requestDto){
        Person person = new Person(requestDto);
        return personRepository.save(person);
    }

    @GetMapping("/api/persons")
    public List<Person> getPerson(){
        return personRepository.findAll();
    }

    @PutMapping("/api/persons/{id}")
    public Long updatePerson(@PathVariable Long id, @RequestBody PersonRequestDto requestDto) {
        return personService.update(id, requestDto);
    }

    @DeleteMapping("/api/persons/{id}")
    public Long deletePerson(@PathVariable Long id){
        personRepository.deleteById(id);
        return  id;
    }
}
