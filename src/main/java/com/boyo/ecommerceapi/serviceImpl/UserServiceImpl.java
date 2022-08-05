package com.boyo.ecommerceapi.serviceImpl;

import com.boyo.ecommerceapi.UserNotFoundException;
import com.boyo.ecommerceapi.dtos.ResponseObject;
import com.boyo.ecommerceapi.dtos.UserRequest;
import com.boyo.ecommerceapi.models.User;
import com.boyo.ecommerceapi.repository.UserRepository;
import com.boyo.ecommerceapi.services.UserService;
import com.boyo.ecommerceapi.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(UserRequest userRequest) {
        User user = new User();
        Mapper.map(userRequest,user);
        return userRepository.save(user);
    }

    @Override
    public User get(Integer userId) {
        return userRepository.findById(userId).orElseThrow(() -> {
            throw new UserNotFoundException("user with " + userId + " not found");
        });
    }

    @Override
    public ResponseObject delete(Integer userId) {
        var user = get(userId);
        userRepository.delete(user);
        ResponseObject responseObject = new ResponseObject();
        responseObject.setMessage(user.getFirstName()+" deleted successfully");
        return responseObject;
    }

    @Override
    public ResponseObject update(Integer userID, UserRequest userRequest) {
        var user = get(userID);
        Mapper.map(userRequest,user);
        userRepository.save(user);
        ResponseObject responseObject = new ResponseObject();
        responseObject.setMessage(user.getFirstName()+" updated successfully");
        return responseObject;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
