package com.znlccy.blog.index;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.znlccy.blog.core.mapper")
@ComponentScan(basePackages = {"com.znlccy.blog.core.*", "com.znlccy.blog.index.*"})
@EnableCaching
@ServletComponentScan
public class BlogIndexApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogIndexApplication.class, args);
    }

}
