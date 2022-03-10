package com.tutorial.praneethpj.tutorial.repository;

import com.tutorial.praneethpj.tutorial.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Praneethpj
 */
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByUsernameOrEmail(String username, String email);

}
