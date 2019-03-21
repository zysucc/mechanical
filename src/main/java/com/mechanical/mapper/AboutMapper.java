package com.mechanical.mapper;

import com.mechanical.model.AboutModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface AboutMapper {

    @Select("select * from jd_about")
    AboutModel findAbout();

}
