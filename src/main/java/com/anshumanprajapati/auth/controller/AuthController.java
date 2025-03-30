package com.anshumanprajapati.auth.controller;


import com.anshumanprajapati.auth.dto.LoginRequestDTO;
import com.anshumanprajapati.auth.dto.LoginResponseDTO;
import com.anshumanprajapati.auth.dto.RegisterRequestDTO;
import com.anshumanprajapati.auth.dto.RegisterResponseDTO;
import com.anshumanprajapati.auth.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping(value="/register", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RegisterResponseDTO> register(@RequestBody RegisterRequestDTO request) {
//        authService.registerUser(request);
        RegisterResponseDTO response = new RegisterResponseDTO();
        response.setEmail(request.getEmail());
        response.setUsername(request.getUsername());
        response.setMessage("User registered successfully");
        return ResponseEntity.ok(response);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(@RequestBody LoginRequestDTO request) {
        return ResponseEntity.ok(new LoginResponseDTO());
//        String token = authService.loginUser(request);
//        return ResponseEntity.ok(new LoginResponseDTO(token));
    }

}
