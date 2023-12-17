package com.example.springtelegrammbot.repository;

import com.example.springtelegrammbot.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
