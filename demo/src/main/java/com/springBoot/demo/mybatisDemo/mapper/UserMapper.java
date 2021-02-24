package com.springBoot.demo.mybatisDemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springBoot.demo.mybatisDemo.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {

}
