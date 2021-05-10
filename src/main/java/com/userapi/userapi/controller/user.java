package com.userapi.userapi.controller;
import com.userapi.userapi.model.User;
import com.userapi.userapi.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/user/api")
public class user {

    @Autowired
    userService userservice;
    @GetMapping(path="/list")
    public Iterable<User> display(){



        var data = userservice.allUsers();
        System.out.println("This my data coming from database "+data);
        return data;
    }


}
