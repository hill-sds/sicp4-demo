package com.springBoot.demo.mybatisDemo.service.impl;

import com.springBoot.demo.mybatisDemo.entity.User;
import com.springBoot.demo.mybatisDemo.mapper.UserMapper;
import com.springBoot.demo.mybatisDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper mapper;

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public User sel(int id) {
        return mapper.selectById(id);
    }

    /**
     * 插入
     * @param user
     */
    public void insertUser(User user) {
        mapper.insert(user);
    }

    /**
     * 修改
     * @param user
     */
    public void updateUser(User user) {
        mapper.updateById(user);
    }

    public void deleteUser(User user) {
        mapper.deleteById(user);
    }
}
