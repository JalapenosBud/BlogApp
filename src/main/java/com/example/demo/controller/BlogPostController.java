package com.example.demo.controller;

import com.example.demo.model.BlogPost;
import com.example.demo.model.ResponseTransfer;
import com.example.demo.repository.BlogPostRepository;
import com.example.demo.service.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/blogposts")
@ComponentScan("com.example.demo")
public class BlogPostController
{
    @Autowired
    BlogPostService blogPostService;

    List<BlogPost> posts = new ArrayList<>();

    /*BlogPostController(BlogPostService blogPostService)
    {
        this.blogPostService = blogPostService;
    }*/

    /*@RequestMapping
    public String handleBlogPostRequestByUser(@RequestParam("User") String userName, Model map)
    {
        map.addAttribute("msg", "blogposts request by user: " + userName);
        return "/index";
    }*/

    /*@PostMapping("/request")
    public ResponseEntity postController(@RequestBody BlogPost blogPost)
    {
        return ResponseEntity.ok(HttpStatus.OK);
    }

    public ResponseTransfer postResponseController(@RequestBody BlogPost blogPost)
    {
        return new ResponseTransfer("thanks for posting!");
    }*/

    /*@GetMapping("/blogposts")
    public String index(Model model, @RequestParam(defaultValue = "0")int page)
    {
        model.addAttribute("blogposts", blogPostService.listAll(page));
        return "blogposts/index";
    }*/

    @GetMapping("/all")
    public ResponseTransfer getResponse()
    {
        ResponseTransfer responseTransfer = new ResponseTransfer("Done", posts);
        return responseTransfer;
    }

    @PostMapping(value = "/save")
   public ResponseTransfer postBlogpost(@RequestBody BlogPost blogPost)
    {
        posts.add(blogPost);

        ResponseTransfer resp = new ResponseTransfer("Done", blogPost);
        return resp;
    }
    /*
    @GetMapping("/create")
    public String getCreateBlogPost(Model model)
    {
        model.addAttribute("blogpost", new BlogPost());
        
        return "blogposts/create";
    }
    
    @PostMapping("/create")
    public String postCreateBlogPost(@RequestBody BlogPost blogPost)
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
    }*/

}
