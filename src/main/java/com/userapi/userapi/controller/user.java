package com.userapi.userapi.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/user/api")
public class user {


    @GetMapping(path="/list")
    public String display(){

      return "money";
    }


}
