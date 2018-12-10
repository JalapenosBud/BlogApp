package com.example.demo.repository;


import com.example.demo.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BlogPostRepository extends JpaRepository<BlogPost, Integer>
{
    List<BlogPost> findByTitleContainsAllIgnoreCase(String titlePart);
}