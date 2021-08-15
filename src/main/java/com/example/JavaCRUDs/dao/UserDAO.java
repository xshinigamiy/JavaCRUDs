package com.example.JavaCRUDs.dao;


import com.example.JavaCRUDs.repository.UserRepository;
import com.example.JavaCRUDs.repository.entities.User;
import org.springframework.stereotype.Component;


@Component
public class UserDAO {

    private final UserRepository userRepository;

    public UserDAO(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }
}
