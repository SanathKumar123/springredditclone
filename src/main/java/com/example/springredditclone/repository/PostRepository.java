package com.example.springredditclone.repository;

import com.example.springredditclone.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Post entity, Long data type of Primary Key.
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
