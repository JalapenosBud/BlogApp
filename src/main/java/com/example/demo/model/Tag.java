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
}
