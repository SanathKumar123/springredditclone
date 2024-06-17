package com.example.springredditclone.repository;

import com.example.springredditclone.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//Post entity, Long data type of Primary Key.
//@Repository
public interface PostRepository extends MongoRepository<Post, Long> {
}
