package com.pluto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName HelloController
 * @Deacription TODO
 * @Author pluto
 * @Date 2020/12/7 19:52
 * @Version 1.0
 **/
//控制器类
@Controller
@RequestMapping("/user")
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println("hello springMVC");
        return "success";
    }
}
