package com.example.springboot3_security_312.repositories;

import java.util.Optional;

import com.example.springboot3_security_312.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

}
