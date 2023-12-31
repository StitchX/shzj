package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
// @RequestMapping("test")
public class RequestMappingController {

    @RequestMapping(value = {"/testRequestMapping","/test"},method = {RequestMethod.GET,RequestMethod.POST})
    public String index(){
        return "success";
    }

    @GetMapping("/testGetMapping")
    public String testGetMapping(){
        return "success";
    }

    @RequestMapping(value = {"/testPut","/test"},method = RequestMethod.DELETE)
    public String testPut(){
        return "success";
    }

    @RequestMapping(value = {"/testParamsAndHeaders","/test"},
            params = {"username","password!=123456"},
            headers = "Host=localhost:8080")
    public String testParamsAndHeaders(){
        return "success";
    }

//    @RequestMapping(value = "/a?a/testAnt")
//    @RequestMapping(value = "/a*a/testAnt")
    @RequestMapping(value = "/**/testAnt")
    public String testAnt(){
        return "success";
    }

    @RequestMapping(value = "/testPath/{id}}")
    public String testPath(@PathVariable("id")Integer id){
        System.out.println("id:"+id);
        return "success";
    }
}
