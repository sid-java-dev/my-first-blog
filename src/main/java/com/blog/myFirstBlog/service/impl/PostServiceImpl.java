package com.blog.myFirstBlog.service.impl;

import com.blog.myFirstBlog.entity.Post;
import com.blog.myFirstBlog.payLoad.PostDto;
import com.blog.myFirstBlog.repository.PostRepository;
import com.blog.myFirstBlog.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        Post post=new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        Post savePost=postRepository.save(post);

        //Api response return back to postMan
        PostDto dto=new PostDto();
        dto.setTitle(savePost.getTitle());
        dto.setDescription(savePost.getDescription());
        dto.setContent(savePost.getContent());

        return dto;
    }
}
