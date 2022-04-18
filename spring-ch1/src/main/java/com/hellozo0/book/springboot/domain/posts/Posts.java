package com.hellozo0.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter //롬복의 어노테이션, 클래스 내 모든 필드의 Getter 메소드를 자동생성
@NoArgsConstructor //롬복의 어노테이션, 기본생성자 자동 추가, public Posts(){}와 같은 효과
@Entity //JPA의 어노테이션 --> 아래에 작성(롬복이 필요 없을경우 쉽게 삭제가능?), 테이블과 링크될 클래스임을 나타냄
public class Posts { //Entity 클래스, Setter 메소드 절대 만들지 말기!

    @Id //해당 테이블의 PK필드를 나타냄
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK 생성 규칙, 해당 옵션을 추가해야만 auto_increment 가능
    private Long id;

    @Column(length = 500, nullable = false) //테이블의 칼럼, 기본값 외에 추가로 변경이 필요한 옵션이 있으면 사용(타입 변경, 사이즈 늘리거나 등등)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder //해당 클래스의 빌더 패턴 클래스를 생성, 생성자 상단에 선언시 생성자에 포함된 필드만 빌더에 포함
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }

}