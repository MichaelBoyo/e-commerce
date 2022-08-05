package com.boyo.ecommerceapi.controller;

import com.boyo.ecommerceapi.dtos.UserRequest;
import com.boyo.ecommerceapi.models.User;
import com.boyo.ecommerceapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping("/ecommerce")
    public ResponseEntity<?> saveUser(@RequestBody UserRequest userRequest) {
        var user = userService.save(userRequest);
        return new ResponseEntity<>(user.getFirstName()+" added successfully",HttpStatus.OK);
    }
    @GetMapping("/ecommerce")
    public List<User> findAll() {
        return userService.findAll();
    }
}
