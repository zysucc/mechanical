package com.mechanical.mapper;


import com.mechanical.model.MenuModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MenuMapper {
    @Select("select title from jd_menu where id = #{id}")
    List<MenuModel> selectMenuById(@Param("id") Long id);

    @Select("select title from jd_menu where category_id = #{id}")
    List<MenuModel> selectMenuByCategory_id(@Param("id") Long id);
}
