package com.example.autotestdemo.service.impl;

import com.example.autotestdemo.dao.UserMapper;
import com.example.autotestdemo.model.User;
import com.example.autotestdemo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper usermapper;
    
    @Override
    public void addUser(User user){
        usermapper.addUser(user);
    }
   
}
