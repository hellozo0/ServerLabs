package com.example.week01.service;

import com.example.week01.controller.Course;
import com.example.week01.controller.Person;
import com.example.week01.models.PersonRequestDto;
import com.example.week01.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service //스프링에게 이 클래스는 서비스임을 명시
public class PersonService {
    private  final PersonRepository personRepository;

    @Transactional // SQL
    public Long update(Long id, PersonRequestDto requestDto) {
        Person person1 = personRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
        );
        person1.update(requestDto);
        return person1.getId();
    }
}
