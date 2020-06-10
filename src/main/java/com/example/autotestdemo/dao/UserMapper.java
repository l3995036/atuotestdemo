package com.example.autotestdemo.dao;

import com.example.autotestdemo.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    public void addUser(User user);
}
