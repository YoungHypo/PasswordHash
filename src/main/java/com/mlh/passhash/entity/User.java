package com.mlh.passhash.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
}