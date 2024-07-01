package com.example.springredditclone.model;

import jakarta.persistence.*;
import lombok.*;
//import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Token") // used to check, verify, and retrieve the user
//@Document
public class VerificationToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String token;
    @OneToOne(fetch = FetchType.LAZY)
    private User user;
    private Instant expiryDate;
}
