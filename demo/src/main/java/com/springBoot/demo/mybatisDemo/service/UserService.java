package com.springBoot.demo.mybatisDemo.service;

import com.springBoot.demo.mybatisDemo.entity.User;
import com.springBoot.demo.mybatisDemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface UserService {

    User sel(int id);

    /**
     * 插入
     * @param user
     */
    void insertUser(User user);

    /**
     * 修改
     * @param user
     */
    void updateUser(User user);

    void deleteUser(User user);

}
