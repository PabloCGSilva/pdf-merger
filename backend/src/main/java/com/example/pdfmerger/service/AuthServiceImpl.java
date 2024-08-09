package com.example.pdfmerger.service;

import com.example.pdfmerger.model.Users;
import com.example.pdfmerger.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private final UsersRepository usersRepository;

    @Autowired
    public AuthServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public Users registerUsers(String email, String password) throws Exception {
        if (usersRepository.findByEmail(email).isPresent()) {
            throw new Exception("User already exists with email: " + email);
        }
        Users newUser = new Users();
        newUser.setEmail(email);
        newUser.setPassword(password); // Consider hashing the password before saving
        return usersRepository.save(newUser);
    }

    @Override
    public Users loginUsers(String email, String password) throws Exception {
        Users user = usersRepository.findByEmail(email)
                .orElseThrow(() -> new Exception("Invalid email or password"));
        if (!user.getPassword().equals(password)) { // Consider using password hashing for comparison
            throw new Exception("Invalid email or password");
        }
        return user;
    }

    @Override
    public Users findByEmail(String email) {
        return usersRepository.findByEmail(email).orElse(null);
    }
}
