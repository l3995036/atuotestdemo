package com.example.autotestdemo.model;

import lombok.Data;

@Data
public class User {
    private int id;
    private String userName;
    private String passWord;
    private String realName;
    private int sex;
    private int age;
}
