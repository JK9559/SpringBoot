package com.wkang.www.springtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String helloSpringBoot(){
        return "Hello SpringBoot!";
    }
    @Value("${pageSize}")
    private Integer pageSize;
    @Value("${devName}")
    private String devName;
    @RequestMapping(value="/showInfo",method = RequestMethod.GET)
    public String show(){
        return "1:"+pageSize+",2:"+devName;
    }

    @Autowired
    private Developer developer;
    @RequestMapping(value = "/developer",method = RequestMethod.GET)
    public String showDeveloper(){
        return developer.toString();
    }

}
