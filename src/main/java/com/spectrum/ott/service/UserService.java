package com.spectrum.ott.service;

import com.spectrum.ott.model.User;
import com.spectrum.ott.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User create(User user) {
        return userRepository.save(user);
    }
}
