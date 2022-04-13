package com.hellozo0.book.springboot.web.dto;

import com.hellozo0.book.springboot.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
    public Posts toEntity() { //Entity 클래스는 DB와 맞닿은 핵심 클래스..!, Request/Response 클래스로 사용해서느 안된다..!
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }

}
