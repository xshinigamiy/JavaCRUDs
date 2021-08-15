package com.example.JavaCRUDs.controller;

import com.example.JavaCRUDs.pojos.request.UserRequest;
import com.example.JavaCRUDs.pojos.response.UserResponse;
import com.example.JavaCRUDs.repository.entities.User;
import com.example.JavaCRUDs.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;

    public UserController( UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/create-user", produces = "application/json")
    public UserResponse CreateUser(@RequestBody UserRequest user) {
        UserResponse response = UserResponse.builder().build();
        User resp = userService.createUser(user);
        response.setId(resp.getId());
        response.setStatusCode(0);
        response.setStatusMessage("success");
        return response;
    }
}
