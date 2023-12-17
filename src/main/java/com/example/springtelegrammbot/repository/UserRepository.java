package com.example.springtelegrammbot.repository;

import com.example.springtelegrammbot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
