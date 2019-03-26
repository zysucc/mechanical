package com.mechanical.mapper;

import com.mechanical.model.AboutModel;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
public interface AboutMapper {

    @Select("select * from wd_about")
    AboutModel findAbout();

}
