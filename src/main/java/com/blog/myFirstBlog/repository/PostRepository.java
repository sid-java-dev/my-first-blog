package com.blog.myFirstBlog.repository;

import com.blog.myFirstBlog.entity.Post;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
