package com.tutorial.praneethpj.tutorial.service;

import com.tutorial.praneethpj.tutorial.model.User;
import com.tutorial.praneethpj.tutorial.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Praneethpj
 */
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User signupUser(String username, String password){

        User user = new User(username,password);
        return userRepository.save(user);

    }

}
