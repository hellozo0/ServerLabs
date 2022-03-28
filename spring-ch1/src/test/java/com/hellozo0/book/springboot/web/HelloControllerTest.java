package com.hellozo0.book.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class) //JUnit에 내장된 실행자 외에 다른 실행자 실행, 스프링 부트 테스트와 JUnit 사이에 연결자 역할
@WebMvcTest(controllers = HelloController.class)// Web(MVC)에 집중할 수 있는 어노테이션,@Controller, @ControllerAdvice 등을 사용할 수 있음
//@Service, @Component, @Repository 등은 사용할 수 없음, 여기서는 컨트로러만 사용하기 때문에 선언
public class HelloControllerTest {

    @Autowired // 스프링이 관리하는 빈(Bean)을 주입받는다
    private MockMvc mvc; //웹 API를 테스트할 때 사용, 이 클래스를 통해 여러 API 테스트를 할 수 있음

    @Test
    public void hello가_리턴된다() throws  Exception {
        String hello = "hello";

        mvc.perform(get("/hello")) // MockMvc를 통해 /hello 주소로 GET 요청
                .andExpect(status().isOk()) //mvc.perform의 결과를 검증, HTTP Header의 Status를 검증, 특히나 200을 검증
                .andExpect(content().string(hello)); // mvc.perform의 결과를 검증, 응답본문의 내용을 검증, "hello" 를 리턴하기 때문에 이 값이 맞는지 검증
    }

    @Test
    public void helloDto가_리턴된다() throws Exception {
        String name = "hello";
        int amount = 1000;

        mvc.perform(
                get("/hello/dto")
                        .param("name", name)
                        .param("amount", String.valueOf(amount)))
                //param : API테스트를 할때 사용될 요청 파라미터를 설정, String만 허용되서 문자열로 변경해야함..!

                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name",is(name)))
                .andExpect(jsonPath("$.amount",is(amount)));
                //jsonPath : JSON응답값을 필드별로 검증할 수 있는 메소드, $를 기준으로 필드명 명시
    }
}