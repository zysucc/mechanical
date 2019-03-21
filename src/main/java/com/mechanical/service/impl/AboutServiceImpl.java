package com.mechanical.service.impl;

import com.mechanical.mapper.AboutMapper;
import com.mechanical.model.AboutModel;
import com.mechanical.service.AboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AboutServiceImpl implements AboutService {

    @Autowired
    AboutMapper aboutMapper;

    @Override
    public AboutModel findAbout(){
        AboutModel AboutUs=aboutMapper.findAbout();
        return AboutUs;
    }


}
