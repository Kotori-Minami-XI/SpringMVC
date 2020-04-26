package com.Kotori.springmvc.controller;

import com.Kotori.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonDemoController {

    @RequestMapping("/getJson.action")
    @ResponseBody //Response解析成json
    public User getJson() {
        User user =new User();
        user.setAge(15);
        user.setUsername("Kotori");
        return user;
    }

    @RequestMapping("/submitJson.action")
    @ResponseBody //Response解析成json
    public String submitJson(@RequestBody User user) { //发送ajax的时候content type设置成非urlEncoded的时候必须要用@RequestBody
        System.out.println(user);
        return "SUCCESS";
    }
}
