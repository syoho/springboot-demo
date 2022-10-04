package com.example.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//启动类
//Spring Initialazr创建
//main方法

//resources-static：静态资源，CSS，JavaScript
//resources-templates：模版引擎页面，html
//application.properties：SpringBoot配置文件，端口号/数据库
//pom.xml：Maven配置文件

@SpringBootApplication
public class SpringbootTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTestApplication.class, args);
    }

}
