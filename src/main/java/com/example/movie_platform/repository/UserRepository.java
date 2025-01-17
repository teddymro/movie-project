package com.example.movie_platform.repository;

import java.util.Optional;

import com.example.movie_platform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}

