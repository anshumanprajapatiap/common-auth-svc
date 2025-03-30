package com.anshumanprajapati.auth.service;

import com.anshumanprajapati.auth.dto.RegisterRequestDTO;
import com.anshumanprajapati.auth.entity.User;
import com.anshumanprajapati.auth.repository.UserRepository;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private UserRepository userRepository;
//    private PasswordEncoder passwordEncoder;

    public void registerUser(RegisterRequestDTO request) {
        User user = new User();
//        user.setUsername(request.getUsername());
//        user.setPassword(passwordEncoder.encode(request.getPassword()));
//        userRepository.save(user);
    }
}
