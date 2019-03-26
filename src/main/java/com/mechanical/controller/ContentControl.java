package com.mechanical.controller;

import com.alibaba.fastjson.JSON;
import com.mechanical.model.ContentModel;
import com.mechanical.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContentControl {
    @Autowired
    ContentService contentService;

    /**
     * 返回一级类目文章
     * @param id
     * @return
     */
    @ResponseBody
    @PostMapping("/findContentById")
    public String findContentById(@RequestParam("id") Long id){
        List<ContentModel> ContentMo= contentService.selectContentById(id);
        return JSON.toJSONString(ContentMo);

    }

    /**
     * 根据父id返回二级类目文章
     * @param id
     * @return
     */
    @ResponseBody
    @PostMapping("/findContentByCategory_id")
    public String findContentByCategory_id(@RequestParam("id") Long id){
        List<ContentModel> ContentMo= contentService.selectContentByCategory_id(id);
        return JSON.toJSONString(ContentMo);

    }
}
