package com.example.demo.repository;


import com.example.demo.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long>
{
    @Query("SELECT b.title FROM BlogPost b where b.id = :id")
    String findTitleById(@Param("id") Long id);

    List<BlogPost> findByTitleContainsAllIgnoreCase(String titlePart);
}