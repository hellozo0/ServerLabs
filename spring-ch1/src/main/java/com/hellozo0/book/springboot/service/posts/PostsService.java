package com.hellozo0.book.springboot.service.posts;


import com.hellozo0.book.springboot.domain.posts.Posts;
import com.hellozo0.book.springboot.domain.posts.PostsRepository;
import com.hellozo0.book.springboot.web.dto.PostsResponseDto;
import com.hellozo0.book.springboot.web.dto.PostsSaveRequestDto;
import com.hellozo0.book.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

//생성자로 Bean객체를 받도록 하면 @Autowired와 동일한 효과, 이곳에서 생성자가 만들어짐?
//생성자로 주입
@RequiredArgsConstructor //final이 선언된 모든 필드를 인자값으로 하는 생성자를 롬복의 옆에꺼가 대시 생성해줌
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto) {
        Posts posts = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id= "+ id));

        posts.update(requestDto.getTitle(), requestDto.getContent());

        return id;
    }

    public PostsResponseDto findById (Long id) {
        Posts entity = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));

        return new PostsResponseDto(entity);
    }
}
