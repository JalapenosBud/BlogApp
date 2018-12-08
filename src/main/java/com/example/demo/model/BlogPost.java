package com.example.demo.model;

import org.hibernate.annotations.NaturalIdCache;
import org.hibernate.annotations.Type;
import org.hibernate.type.descriptor.sql.LobTypeMappings;

import javax.persistence.*;
import java.time.ZonedDateTime;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@NaturalIdCache
@Entity
@Table(name = "blogposts")
public class BlogPost
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(name = "title",nullable = false, length = 100)
    private String title;

    @Column(name = "author", nullable = false, length = 25)
    private String author;

    @Column(name = "creation_date")
    private Date creation_date;

    @Column(name = "blog_post_text")
    @Lob
    private String blog_post_text;

    @ManyToMany(cascade = { CascadeType.PERSIST,
            CascadeType.MERGE})
    @JoinTable(name = "post_tag",
            joinColumns = @JoinColumn(name = "post_id"), //parent
            inverseJoinColumns = @JoinColumn(name ="tag_id")) //child
    private Set<Tag> tags = new HashSet<>();


    public BlogPost()
    {
    
    }
    
    public BlogPost(long id, String title, String author, Date creation_date, String blog_post_text)
    {
        this.id = id;
        this.title = title;
        this.author = author;
        this.creation_date = creation_date;
        this.blog_post_text = blog_post_text;
    }
    

    
    public long getId()
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
    
    public String getAuthor()
    {
        return author;
    }
    
    public void setAuthor(String author)
    {
        this.author = author;
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
    

}
