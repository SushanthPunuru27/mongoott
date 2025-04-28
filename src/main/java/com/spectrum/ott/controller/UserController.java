package com.spectrum.ott.controller;

import com.spectrum.ott.model.User;
import com.spectrum.ott.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/find")
    public List<User> listofAll() {
        return userService.getAll();
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userService.create(user);
    }
}
