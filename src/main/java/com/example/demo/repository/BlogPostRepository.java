package com.example.demo.repository;

import com.example.demo.interfaces.BlogPostRepositoryInterface;
import com.example.demo.model.BlogPost;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import java.util.List;

@Repository
public class BlogPostRepository implements BlogPostRepositoryInterface
{
    
    @Override
    public void saveBlogPostToDB(BlogPost model)
    {
        String title;
        String author;
        String blogPostText;
    }
    
    @Override
    public List<BlogPost> getAllBlogPosts()
    {
        return null;
    }
}
