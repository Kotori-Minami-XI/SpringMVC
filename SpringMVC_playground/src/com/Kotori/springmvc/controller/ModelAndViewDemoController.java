package com.Kotori.springmvc.controller;

import com.Kotori.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelAndViewDemoController {
    /*
     * ModelAndView可以在Model中设置数据，view中设定重定向或者转发地址
     */
    @RequestMapping("/displayModelAndView.action")
    public ModelAndView displayModelAndView() {
        User user = new User();
        user.setUsername("Honoka");
        user.setAge(12);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", user);
        modelAndView.setViewName("/ModelAndViewDemoJSP/ModelAndViewDemo_result.jsp");
        return modelAndView;
    }

    /*
     * model没有view，只能返回String
     */
    @RequestMapping("/displayModel.action")
    public String displayModel(Model model) {
        User user = new User();
        user.setUsername("Kotori");
        user.setAge(14);

        model.addAttribute("user", user);

        System.out.println(model.asMap());
        return "/ModelAndViewDemoJSP/ModelAndViewDemo_result.jsp";
    }

    @RequestMapping("/addAttribute.action")
    public String addAttribute(Model model){

        //addAttribute会覆盖同名的key的value
        model.addAttribute("name","Kotori");
        model.addAttribute("name","Honoka");
        System.out.println(model.asMap());


        return "/ModelAndViewDemoJSP/ModelAndViewDemo_result.jsp";
    }





}
