package com.mechanical.repository.mybatis;

import com.mechanical.model.UserModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<UserModel> getAll();
}
