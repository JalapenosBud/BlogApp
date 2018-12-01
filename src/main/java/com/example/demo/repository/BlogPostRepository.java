package com.example.demo.repository;

import com.example.demo.model.BlogPost;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public class BlogPostRepository implements BaseRepository<BlogPost, Long> {

    @Override
    public void delete(BlogPost deleted) {

    }

    @Override
    public List<BlogPost> findAll() {
        return null;
    }

    @Override
    public Optional<BlogPost> findOne(Long l) {
        return Optional.empty();
    }

    @Override
    public BlogPost save(BlogPost persisted) {
        return null;
    }
}
