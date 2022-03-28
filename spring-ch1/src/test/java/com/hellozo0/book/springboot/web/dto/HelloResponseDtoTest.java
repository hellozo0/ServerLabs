package com.hellozo0.book.springboot.web.dto;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬북_기능_테스트() {
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name,amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
        //asertThat : 검증하고 싶은 대상을 메소드 인자로 받는다. 메소드 체이닝이 지원되어 isEqualTo와 같이 메소드를 이어서 사용 가능
        //isEqualTo : assertThat에 있는 값과 비교해서 같을 때만 성공
    }
}