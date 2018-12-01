package com.example.demo.interfaces;

import com.example.demo.model.BlogPost;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import java.util.List;

@Repository
public interface BlogPostRepositoryInterface
{
    void saveBlogPostToDB(BlogPost model);
    List<BlogPost> getAllBlogPosts();
    BlogPost searchForBlogPost(String searchTerm);
}
