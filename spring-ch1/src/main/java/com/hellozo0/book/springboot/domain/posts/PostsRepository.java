package com.hellozo0.book.springboot.domain.posts;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository<Entity 클래스 , PK타입> --> CRUD 메소드 자동 생성
//주의 할점 : Entity 클래스와 기본 Entity Repository는 함께 위치
public interface PostsRepository extends JpaRepository<Posts, Long> {

}
