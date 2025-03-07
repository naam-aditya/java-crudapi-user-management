package com.example.crudapi.service;

import java.util.List;

import com.example.crudapi.model.User;

public interface UserService {
    List<User> getAllUsers();
    // List<User> getActiveUsers();
    User getUserById(Long id);
    // User getUserByEmail(String Email);
    User creatUser(User user);
    User updateUser(Long id, User userDetails);
    void deleteUser(Long id);
    void softDeleteUser(Long id);
}