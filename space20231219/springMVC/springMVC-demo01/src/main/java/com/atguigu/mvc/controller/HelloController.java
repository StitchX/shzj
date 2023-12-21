package com.atguigu.mvc.controller;

/*
由于前端控制器对浏览器发送的请求进行了统一的处理，但是具体的请求有不同的处理过程，因此需要创建处理具体请求的类，即请求控制器
请求控制器中每一个处理请求的方法成为控制器方法
因为SpringMVC的控制器由一个POJ0 (普通的Java类)担任，因此需要通过@Controller注解将其标识为一个控制层组件，交给Spring的loC容器管理，
此时SpringMVC才能够识别控制器的存在
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

//    "/"-->/WEB-INF/templates/index.html
    @RequestMapping(value = "/")
    public String index(){
//        返回视图名称
        return "index";
    }

    @RequestMapping("/target")
    public String toTarget(){
        return "target";
    }
}
