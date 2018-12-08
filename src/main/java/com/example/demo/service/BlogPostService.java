package com.example.demo.service;

import com.example.demo.model.BlogPost;
import com.example.demo.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class BlogPostService {

    @Autowired
    BlogPostRepository repository;

    public Page<BlogPost> listAll(int page) {
        return repository.findAll(PageRequest.of(page,10));
    }

    public BlogPost save(BlogPost blogPost)
    {
        return repository.save(blogPost);
    }
}
