package com.example.ssecurity.security.service;

import com.example.ssecurity.security.domain.User;
import com.example.ssecurity.security.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class UserService {
    private final Logger log = LoggerFactory.getLogger(getClass());

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Autowired
    private UserRepository userRepository;

    public void createUser(User user) {
        User existing = userRepository.findByUsername(user.getUsername());
        Assert.isNull(existing, "user already exists: " + user.getUsername());

        String hash = encoder.encode(user.getPassword());
        user.setPassword(hash);
        userRepository.save(user);
        log.info("new user has been created: {}", user.getUsername());
    }
}