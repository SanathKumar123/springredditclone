package com.example.springredditclone.repository;

import com.example.springredditclone.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface CommentRepository extends MongoRepository<Comment, Long> {
}
