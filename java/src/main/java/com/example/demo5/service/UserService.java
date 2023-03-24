package com.example.demo5.service;

import com.example.demo5.Mapper.UserMapper;
import com.example.demo5.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public int add(User user) {
        return userMapper.insert(user);
    }
}
