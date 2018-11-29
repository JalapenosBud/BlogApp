package com.example.demo.repository;

import com.example.demo.model.BlogPost;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import java.util.List;

@Repository
public interface BlogPostRepository
{
    void saveBlogPostToDB(BlogPost model);
    List<BlogPost> getAllBlogPosts();
}
