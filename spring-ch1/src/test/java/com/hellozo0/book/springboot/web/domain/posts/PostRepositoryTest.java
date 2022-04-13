package com.hellozo0.book.springboot.web.domain.posts;


import com.hellozo0.book.springboot.domain.posts.Posts;
import com.hellozo0.book.springboot.domain.posts.PostsRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostRepositoryTest  {

    @Autowired
    PostsRepository postsRepository;

    //Junit에서 단위 테스트가 끝날 떄마다 수행되는 메소드를 지정
    //배포 전 전체 테스트를 수행할때 테스트간 데이터 침범을 막기 위해 사용
    // 여러 테스트가 도이에 수행되면 테스트용 DB인 h2에 데이터가 그대로 남아 있어 다음 테스트 실행 시 테스트 실패할 수 있음
    @After
    public void cleanup() {
        postsRepository.deleteAll();
    }

    @Test
    public void 게시글저장_불러오기() {
        //given
        String title = "테스트 게시글";
        String content = "테스트 본문";

        postsRepository.save(Posts.builder() //테이블 posts에 insert/update 쿼리를 실행 , id값이 있다면 update 없으면 insert 쿼리 실행
                .title(title)
                .content(content)
                .author("ahju0011@gmail.com")
                .build());

        //when
        List<Posts> postsList = postsRepository.findAll(); // 테이블 posts에 있는 모든 데이터를 조회해오는 메소드

        //then
        Posts posts = postsList.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);
    }

}
