package com.boyo.ecommerceapi.utils;

import com.boyo.ecommerceapi.dtos.UserRequest;
import com.boyo.ecommerceapi.models.User;
import org.springframework.beans.factory.annotation.Autowired;

public class Mapper {


    public static void map(UserRequest request, User user) {
        user.setFirstName(request.getFirstName());
        user.setEmail(request.getEmail());
        user.setPassword(PasswordEncoder.encode(request.getPassword()));
    }
}
