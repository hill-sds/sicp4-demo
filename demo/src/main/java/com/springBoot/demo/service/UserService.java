package com.springBoot.demo.service;

import com.springBoot.demo.entity.User;


public interface UserService {

    User sel(int id);

    void insertUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

}
