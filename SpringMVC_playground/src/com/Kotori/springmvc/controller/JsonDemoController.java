package com.Kotori.springmvc.controller;

import com.Kotori.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonDemoController {

    @RequestMapping("/getJson.action")
    @ResponseBody //解析成json
    public User getJson() {
        User user =new User();
        user.setAge(15);
        user.setUsername("Kotori");
        return user;
    }

    @RequestMapping("/submitJson.action")
    @ResponseBody //解析成json
    public String submitJson(User user) {
        System.out.println(user);
        return "SUCCESS";
    }
}
