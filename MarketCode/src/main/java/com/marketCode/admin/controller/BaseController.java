package com.marketCode.admin.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class BaseController {



    @GetMapping("Hello")
    public String hello(){
        return "hello world";
    }



//    登录、注册 springSecurity,jjwt
//    文件上传
}
