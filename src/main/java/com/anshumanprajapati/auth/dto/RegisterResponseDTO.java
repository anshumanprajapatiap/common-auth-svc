package com.anshumanprajapati.auth.dto;

import lombok.Data;
import lombok.Generated;

@Data
@Generated
public class RegisterResponseDTO {
    public String message;
    public String username;
    public String email;

    public RegisterResponseDTO(String message, String username, String email) {
        this.message = message;
        this.username = username;
        this.email = email;
    }

    public RegisterResponseDTO() {
        // Default constructor
    }
}
