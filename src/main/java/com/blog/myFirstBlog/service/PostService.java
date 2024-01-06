package com.blog.myFirstBlog.service;

import com.blog.myFirstBlog.payLoad.PostDto;

public interface PostService {

    PostDto createPost(PostDto postDto);
}
