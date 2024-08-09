package com.example.pdfmerger.service;

import com.example.pdfmerger.model.Users;

public interface AuthService {

    Users registerUsers(String email, String password) throws Exception;

    Users loginUsers(String email, String password) throws Exception;

    Users findByEmail(String email); // Add this method for finding a user by email
}
