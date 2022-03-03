package com.tutorial.praneethpj.tutorial.repository;

import com.tutorial.praneethpj.tutorial.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Praneethpj
 */
public interface UserRepository extends JpaRepository<User,Long> {

}
