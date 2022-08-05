package com.boyo.ecommerceapi.services;

import com.boyo.ecommerceapi.dtos.ResponseObject;
import com.boyo.ecommerceapi.dtos.UserRequest;
import com.boyo.ecommerceapi.models.User;

import java.util.List;

public interface UserService {
    User save(UserRequest userRequest);
    User get(Integer userId);
    ResponseObject delete(Integer userID);
    ResponseObject update(Integer userID, UserRequest userRequest);

    List<User> findAll();
}
