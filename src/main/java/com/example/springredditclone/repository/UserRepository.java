package com.example.springredditclone.repository;

import com.example.springredditclone.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface UserRepository extends MongoRepository<User, Long> {
}
