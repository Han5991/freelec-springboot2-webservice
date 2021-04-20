package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//Entity 클래스와 기본 Entity Repository는 함께 위치해야함
public interface PostsRepository extends JpaRepository<Posts, Long> {
    @Query("select p from Posts p ORDER BY  p.id desc")
    List<Posts> findAllDesc();
}
