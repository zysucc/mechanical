package com.mechanical.config;

import org.apache.ibatis.type.TypeAliasRegistry;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.io.IOException;

@Configuration
public class MyBatisConfig {

    @Resource
    private DataSource dataSource;

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactoryBean sqlSessionFactoryBean (ApplicationContext applicationContext) throws IOException{
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();

        sqlSessionFactory.setDataSource(dataSource);
        sqlSessionFactory.setMapperLocations(applicationContext.getResources("classpath*:mapper/*.xml"));

        TypeAliasRegistry typeAliasRegistry = new TypeAliasRegistry();

        typeAliasRegistry.registerAlias("STDOUT_LOGGING",MyBatisConfig.class);

        return sqlSessionFactory;

    }


}
