package com.example.JavaCRUDs.service;

import com.example.JavaCRUDs.dao.UserDAO;
import com.example.JavaCRUDs.pojos.request.UserRequest;
import com.example.JavaCRUDs.repository.entities.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserDAO userDAO;

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public User createUser(UserRequest user) {
        User userObj = userRequestEntityMapper(user);
        return userDAO.save(userObj);
    }

    private User userRequestEntityMapper(UserRequest user) {
        return User.builder()
                .age(user.getAge().intValue())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .build();
    }

}
