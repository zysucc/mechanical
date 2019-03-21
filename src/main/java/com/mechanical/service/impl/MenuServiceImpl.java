package com.mechanical.service.impl;

import com.mechanical.mapper.MenuMapper;
import com.mechanical.model.MenuModel;
import com.mechanical.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<MenuModel> selectMenuById(Long id){
        return menuMapper.selectMenuById(id);

    }

    @Override
    public List<MenuModel> selectMenuByCategory_id(Long id){
        return menuMapper.selectMenuByCategory_id(id);

    }
}
