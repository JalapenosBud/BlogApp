package com.example.demo.controller;

import com.example.demo.model.BlogPost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController
{
    public String home()
    {
        return "index";
    }

    public String searchForBlog(String searchTerm)
    {
        return "";
    }
}
