package com.example.autotestdemo.controller;

import com.example.autotestdemo.model.User;
import com.example.autotestdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //请求控制器，接收请求
@RequestMapping("/index")
public class UserController {
    @Autowired
    UserService userservice;
    @PostMapping ("/adduser")
    public String addUser( @RequestBody User user){
        userservice.addUser(user);
        return "success";
    }

}
