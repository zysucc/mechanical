package com.mechanical.service.impl;

import com.mechanical.repository.mybatis.UserMapper;
import com.mechanical.model.UserModel;
import com.mechanical.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserModel> getAll() {
        return userMapper.getAll();
    }
}
