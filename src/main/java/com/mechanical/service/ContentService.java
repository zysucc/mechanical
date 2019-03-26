package com.mechanical.service;

import com.mechanical.model.ContentModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContentService {
    List<ContentModel> selectContentById(Long id);

    List<ContentModel> selectContentByCategory_id(Long id);
}
