package com.userapi.userapi.service;

import com.userapi.userapi.model.User;
import com.userapi.userapi.repo.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class userService implements IUser {

    @Autowired
    userRepo userRepo;

    @Override
    public Iterable<User> allUsers() {
      return userRepo.findAll();
    }

    @Override
    public void adduser(User user) {
        userRepo.save(user);
    }
}
