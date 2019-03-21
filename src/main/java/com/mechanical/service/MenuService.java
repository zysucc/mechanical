package com.mechanical.service;

import com.mechanical.model.MenuModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MenuService {
    List<MenuModel> selectMenuById(Long id);

    List<MenuModel> selectMenuByCategory_id(Long id);
}
