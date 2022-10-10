package com.example.week02.controller;

import com.example.week02.domain.Course;
import com.example.week02.domain.CourseRepository;
import com.example.week02.models.CourseRequestDto;
import com.example.week02.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CourseController {

    private final CourseRepository courseRepository;
    private final CourseService courseService;

    @GetMapping("/api/courses")
    public List<Course> getCourses(){
        return courseRepository.findAll();
    }

    @PostMapping("/api/courses")
    public Course createCourse(@RequestBody CourseRequestDto requestDto) {
        //requestDto는 생성 요청을 의미
        // 강의 정보를 만들기 위해서는 강의 제목과 튜터 이름이 필요하잖아요?
        //그 정보를 가져오는 녀석

        //저장하는 것은 Dto가 아니라 Course이니, Dto의 정보를 course에 담아야 합니다.
        //잠시 뒤 새로운 생성자를 만듭니다.
        Course course = new Course(requestDto);

        //JPA를 사용하여 DB에 저장하고, 그 결과를 반환합니다.
        return courseRepository.save(course);
    }

    @PutMapping("/api/courses/{id}")
    public Long updateCourse(@PathVariable Long id, @RequestBody CourseRequestDto requestDto) {
        return courseService.update(id, requestDto);
    }

    @DeleteMapping("/api/courses/{id}")
    public Long deleteCourse(@PathVariable Long id){
        courseRepository.deleteById(id);
        return  id;
    }


}
