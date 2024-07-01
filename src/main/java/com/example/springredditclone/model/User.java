package com.example.springredditclone.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
//import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Document
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @NotBlank(message = "Feild cannot be empty")
    private String username;
    @NotBlank(message = "Feild cannot be empty")
    private String password;
    @Email
    @NotEmpty
    private String email;
    private Instant created;
    private boolean enabled; //Enabled after email verification process
}
