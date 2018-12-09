package com.example.demo.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "Tag")
@Table(name = "tag")
public class Tag {

    @Id
    @GeneratedValue
    private int id;

    @Size(max = 64)
    private String name;

    @ManyToMany( mappedBy = "tags")
    private Set<BlogPost> blogPosts = new HashSet<>();

    public Tag() {
    }

    public Tag(@Size(max = 64) String name, Set<BlogPost> blogPosts) {
        this.name = name;
        this.blogPosts = blogPosts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<BlogPost> getBlogPosts() {
        return blogPosts;
    }

    public void setBlogPosts(Set<BlogPost> blogPosts) {
        this.blogPosts = blogPosts;
    }
}
