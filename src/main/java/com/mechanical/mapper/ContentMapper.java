package com.mechanical.mapper;

import com.mechanical.model.ContentModel;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContentMapper {

    @Select("select * from wd_content where id = #{id}")
    List<ContentModel> selectContentById(@Param("id") Long id);

    @Select("select * from wd_content where category_id = #{id}")
    List<ContentModel> selectContentByCategory_id(@Param("id") Long id);
}
