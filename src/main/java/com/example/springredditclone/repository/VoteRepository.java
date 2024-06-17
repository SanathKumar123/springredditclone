package com.example.springredditclone.repository;

import com.example.springredditclone.model.Vote;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface VoteRepository extends MongoRepository<Vote, Long> {
}
