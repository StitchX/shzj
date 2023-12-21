package com.atguigu.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class TestController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }


    @RequestMapping("/param")
    public String param(){
        return "test_param";
    }

    @RequestMapping("/testParam")
//    public String testParam(String username,String password,String hobby){
    public String testParam(
//            required是否必须传输
            @RequestParam(value = "user_name",required = false,defaultValue = "呵呵") String username,
            String password,
            String[] hobby,
            @RequestHeader(value = "sayhaha",required = false,defaultValue = "haha")String name,
            @CookieValue("JSESSIONID")String JSESSIONID){
//        若请求参数中出现多个同名的请求参数，可以再控制器方法的形参位置设置字符串类型或字符串数组接收此请求参数
//        若使用字符串类型的形参，最终结果为请求参最的每一个值之间使用逗号进行拼接
        System.out.println("username:"+username+",password:"+password+",hobby"+ Arrays.toString(hobby));
        System.out.println("host"+name);
        System.out.println("JSESSIONID"+JSESSIONID);
        return "success";
    }
}
