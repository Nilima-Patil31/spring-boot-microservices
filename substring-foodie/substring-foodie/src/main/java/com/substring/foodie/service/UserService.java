package com.substring.foodie.service;

import com.substring.foodie.entity.User;
import org.springframework.stereotype.Service;

public interface UserService {
    User saveUser(User user);
    public User updateUser(User user, String userId);
    public void testUserRole();
}
