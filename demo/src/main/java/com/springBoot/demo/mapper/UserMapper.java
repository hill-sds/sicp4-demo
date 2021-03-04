package com.springBoot.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springBoot.demo.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {

}
