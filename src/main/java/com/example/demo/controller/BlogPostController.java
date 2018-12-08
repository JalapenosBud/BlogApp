package com.example.demo.controller;

import com.example.demo.model.BlogPost;
import com.example.demo.repository.BlogPostRepository;
import com.example.demo.service.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/blogposts")
@ComponentScan("com.example.demo")
public class BlogPostController
{
    @Autowired
    BlogPostService blogPostService;

    @RequestMapping
    public String handleBlogPostRequestByUser(@RequestParam("User") String userName, Model map)
    {
        map.addAttribute("msg", "blogposts request by user: " + userName);
        return "/index";
    }

    @GetMapping
    public String index(Model model, @RequestParam(defaultValue = "0")int page)
    {
        model.addAttribute("blogposts", blogPostService.listAll(page));
        return "blogposts/index";
    }
    
    @GetMapping("/create")
    public String getCreateBlogPost(Model model)
    {
        model.addAttribute("blogpost", new BlogPost());
        
        return "blogposts/create";
    }
    
    @PostMapping("/create")
    public String postCreateBlogPost(@ModelAttribute BlogPost blogPost)
    {
        blogPostService.save(blogPost);
        
        //refactor this return to handle jquery auto update in html
        return "blogposts/postcreated";
    }

    @GetMapping("/search")
    public String getSearchBlogPost()
    {
        return "search";
    }

    @PostMapping("/search")
    public String postSearchBlogPost(String titlename)
    {
        return "redirect:search";
    }

}
