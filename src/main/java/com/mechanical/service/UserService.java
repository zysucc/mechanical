package com.mechanical.service;

import com.mechanical.model.UserModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<UserModel> getAll();
}
