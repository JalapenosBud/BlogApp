package com.example.demo.model;

import java.util.Date;

public class BlogPost
{
    int id;
    String title;
    String user_name_author;
    Date creation_date;
    
    public int getId()
    {
        return id;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public String getUser_name_author()
    {
        return user_name_author;
    }
    
    public void setUser_name_author(String user_name_author)
    {
        this.user_name_author = user_name_author;
    }
    
    public Date getCreation_date()
    {
        return creation_date;
    }
    
    public void setCreation_date(Date creation_date)
    {
        this.creation_date = creation_date;
    }
    
    public String getBlog_post_text()
    {
        return blog_post_text;
    }
    
    public void setBlog_post_text(String blog_post_text)
    {
        this.blog_post_text = blog_post_text;
    }
    
    String blog_post_text;
}
