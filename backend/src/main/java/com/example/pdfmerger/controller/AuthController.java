package com.example.pdfmerger.controller;

import com.example.pdfmerger.model.Users;
import com.example.pdfmerger.service.AuthService;
import com.example.pdfmerger.service.JwtTokenService;
import com.example.pdfmerger.dto.AuthResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @Autowired
    private JwtTokenService jwtTokenService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Users user) {
        try {
            // Assuming registerUsers method registers the user and returns UserDetails
            Users newUser = authService.registerUsers(user.getEmail(), user.getPassword());
            return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Registration failed: " + e.getMessage());
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Users user) {
        try {
            // Assuming loginUsers method authenticates the user and returns UserDetails
            Users authenticatedUser = authService.loginUsers(user.getEmail(), user.getPassword());
            if (authenticatedUser != null) {
                String token = jwtTokenService.generateToken(authenticatedUser);
                AuthResponseDTO response = new AuthResponseDTO(token);
                return ResponseEntity.ok(response);
            }
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Login failed: " + e.getMessage());
        }
    }
}
