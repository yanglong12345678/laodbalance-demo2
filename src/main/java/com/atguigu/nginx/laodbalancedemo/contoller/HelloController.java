package com.atguigu.nginx.laodbalancedemo.contoller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    //Spring容器创建时通过SpringEL加载端口号设置给prot
    @Value("${server.port}")
    private Integer port;
    @ResponseBody
    @RequestMapping("/hello")
    public String test(){
        return "hello , 当前端口号:"+ port;
    }

}
