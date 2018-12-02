package com.example.demo.controller;



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
