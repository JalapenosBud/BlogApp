package com.example.demo.repository;



@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface BlogPostRepository extends PagingAndSortingRepository<WebsiteUser, Long> {
    List<WebsiteUser> findByName(@Param("name") String name);
}