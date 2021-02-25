package com.springBoot.demo.mybatisDemo.controller;

import com.springBoot.demo.mybatisDemo.common.dto.ResultDTO;
import com.springBoot.demo.mybatisDemo.entity.User;
import com.springBoot.demo.mybatisDemo.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("swaggerDemoController相关的api")
public class UserController {

    @Autowired
    private UserService service;

    /**
     *
     * @param id
     * @return
     */
    @PostMapping("getUser/{id}")
    public ResultDTO GetUser(@PathVariable int id){
        User user = service.sel(id);
        return new ResultDTO("0", user.toString());
    }

    @PostMapping("selectUser/{id}")
    public ResultDTO selectId() {
        return new ResultDTO("0", "1");
    }

}
