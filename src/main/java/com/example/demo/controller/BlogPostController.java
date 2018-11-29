package com.example.demo.controller;

import com.example.demo.model.BlogPost;
import com.example.demo.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blogposts")
@ComponentScan("com.example.demo")
public class BlogPostController
{
    
    BlogPostRepository blogPostRepository;
    
    @GetMapping
    public void getListOfBlogs()
    {
    
    }
    
    @PostMapping("/newblogpost")
    public String createBlogPost(@ModelAttribute BlogPost blogPost)
    {
        blogPostRepository.saveBlogPostToDB(blogPost);
        
        //refactor this return to handle jquery auto update in html
        return "/blogposts";
    }
}
