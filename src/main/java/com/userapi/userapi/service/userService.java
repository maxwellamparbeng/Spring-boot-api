package com.userapi.userapi.service;

import com.userapi.userapi.model.User;
import org.springframework.stereotype.Service;

@Service
public class userService implements IUser {


    @Override
    public Iterable<User> allUsers() {
        return null;
    }

    @Override
    public void adduser(User user) {

    }
}
