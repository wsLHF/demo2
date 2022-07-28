package com.example.demo.controller;


import com.example.demo.beans.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
public class UserController {
    @Autowired
    private User user;
    @Resource
    UserService userService;


    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){

        return user.getId();
    }



    @PostMapping("/login/")
    @CrossOrigin("*")
    String login(@RequestBody User user1){
       return userService.login(user1);
    }








}
