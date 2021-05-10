package com.userapi.userapi.service;

import com.userapi.userapi.model.User;

public interface IUser {
    Iterable<User> allUsers();
    void adduser(User user);
}

