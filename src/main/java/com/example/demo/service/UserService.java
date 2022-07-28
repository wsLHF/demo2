package com.example.demo.service;

import com.example.demo.beans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    public User user;
public String login(User user1){
    if(user1.equals(user)){
        return "success";
    }else {
        return "error";
    }
}
}
