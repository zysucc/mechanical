package com.mechanical.service.impl;

import com.mechanical.mapper.ContentMapper;
import com.mechanical.model.ContentModel;
import com.mechanical.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentServiceImpl implements ContentService {

    @Autowired
    private ContentMapper contentMapper;

    @Override
    public List<ContentModel> selectContentById(Long id){
        return contentMapper.selectContentById(id);
    }

    @Override
    public List<ContentModel> selectContentByCategory_id(Long id){
        return contentMapper.selectContentByCategory_id(id);
    }
}
