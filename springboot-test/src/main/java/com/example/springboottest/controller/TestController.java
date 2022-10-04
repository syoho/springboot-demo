package com.example.springboottest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //使本类充当控制器
public class TestController {
    @ResponseBody //让返回值作为JSON数据响应到客户端浏览器
    @RequestMapping("test") //将"/test"的URL路径映射到该方法
    public void test(){
        System.out.println("Hello World");
    }
}
