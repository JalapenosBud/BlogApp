package com.example.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

//---THIS repository allows us to create other repositories that provides
//CRUD operations without declaring the "same" methods in every repository interface.


//Annotation to exclude repository interfaces from
// being picked up and thus in consequence getting
// an instance being created.
@NoRepositoryBean
interface BaseRepository<T,ID extends Serializable> extends Repository<T, ID> {

    void delete(T deleted);

    List<T> findAll();

    @Query("SELECT t.title from blogposts t where t.id = :id")
    Optional<T> findOne(ID id);

    T save (T persisted);

}
