package com.mechanical.controller;

import com.alibaba.fastjson.JSON;
import com.mechanical.model.UserModel;
import com.mechanical.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserControl {
    @Autowired
    private UserService userService;

    @RequestMapping("/userGetAll")
    public String getAll(){
        List<UserModel> userMo= userService.getAll();
        return JSON.toJSONString(userMo);
    }
}
