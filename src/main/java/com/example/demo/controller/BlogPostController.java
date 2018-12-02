package com.example.demo.controller;

import com.example.demo.model.BlogPost;



@Controller
@RequestMapping("/blogposts")
@ComponentScan("com.example.demo")
public class BlogPostController
{
    
    @GetMapping("/")
    public String index()
    {
        return "/";
    }
    
    @GetMapping("/create")
    public String getCreateBlogPost(Model model)
    {
        model.addAttribute("blogpost", new BlogPost());
        
        return "/blogposts/create";
    }
    
    @PostMapping("/create")
    public String postCreateBlogPost(@ModelAttribute BlogPost blogPost)
    {
        //blogPostRepository.saveBlogPostToDB(blogPost);
        
        //refactor this return to handle jquery auto update in html
        return "/blogposts/postcreated";
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
