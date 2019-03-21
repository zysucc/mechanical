package com.mechanical.controller;

import com.alibaba.fastjson.JSON;
import com.mechanical.model.MenuModel;
import com.mechanical.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class MenuControl {

    @Autowired
    MenuService menuService;

    /**
     * 返回导航一级菜单
     * @param id
     * @return
     */
    @ResponseBody
    @PostMapping("/menu")
    public String findMenuById(@RequestParam("id") Long id){
        List<MenuModel> MenuMo= menuService.selectMenuById(id);
        return JSON.toJSONString(MenuMo);

    }

    /**
     * 根据父id返回二级菜单
     * @param id
     * @return
     */
    @ResponseBody
    @PostMapping("/category_menu")
    public String findMenuByCategory_id(@RequestParam("id") Long id){
        List<MenuModel> menuMo= menuService.selectMenuByCategory_id(id);
        return JSON.toJSONString(menuMo);

    }


}
