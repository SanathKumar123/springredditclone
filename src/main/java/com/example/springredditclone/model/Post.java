package com.example.springredditclone.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.*;

import java.time.Instant;


@Data //Responsible for automatically generating getters and setters for this class
@Entity
@Builder // Uses builder design pattern to generate objects for the class
//Generating constructors
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;
    @NotBlank(message = "Cannot be null")
    private String postName;
    @Nullable
    private Long url;
    @Nullable
    @Lob// For large chunks of texts.
    private String description;
    private Integer voteCount;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User user;
    private Instant createdDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Subreddit subreddit;
}
