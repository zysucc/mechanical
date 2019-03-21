package com.mechanical.controller;

import com.alibaba.fastjson.JSON;
import com.mechanical.model.AboutModel;
import com.mechanical.service.AboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AboutControl{

    @Autowired
    AboutService aboutService;

    /**
     * 返回关于我们的见解
     * @return
     */
    @GetMapping("/about")
    public String findId(){
        AboutModel aboutMo = aboutService.findAbout();
        return JSON.toJSONString(aboutMo);
    }


}
