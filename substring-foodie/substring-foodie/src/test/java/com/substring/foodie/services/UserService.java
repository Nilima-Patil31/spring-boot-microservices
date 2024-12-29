package com.substring.foodie.services;

import com.substring.foodie.entity.Restaurant;
import com.substring.foodie.entity.Role;
import com.substring.foodie.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
public class UserService {
    @Autowired
    private com.substring.foodie.service.UserService userService;

    @Test
    public void testSaveUser(){
        /*System.out.println("Saving User");
        User user=new User();
        user.setAddress("Pune");
        user.setAvailable(true);
        user.setName("Nisha");
        user.setEmail("nil@gmail.com");
        user.setPassword("123");
        user.setPhoneNumber("121313");
        user.setRoles(Role.ADMIN);

        Restaurant restaurant=new Restaurant();
        restaurant.setId(UUID.randomUUID().toString());
        restaurant.setAddress("Pune");
        restaurant.setName("KFC");
        restaurant.setOpen(true);


        Restaurant restaurant1=new Restaurant();
        restaurant1.setId(UUID.randomUUID().toString());
        restaurant1.setAddress("Mumbai");
        restaurant1.setName("Pizza hut");
        restaurant1.setOpen(true);

        restaurant.setUser(user);
        restaurant1.setUser(user);


        user.getRestaurants().add(restaurant);
        user.getRestaurants().add(restaurant1);

        User savedUser = userService.saveUser(user);
        System.out.println(savedUser.getName());*/
    }
    @Test
    public void testUpdate(){
        userService.testUserRole();
        /*userService.updateUser();
        System.out.println("user updated");*/
    }
}
