package com.Kotori.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstDemoController {
    @RequestMapping ("/first.action")
    public ModelAndView test1() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("name", "Kotori");
        modelAndView.setViewName("/firstDemoJSP/firstDemo_result.jsp");
        return modelAndView;
    }

    @RequestMapping ("/second.action")
    public String test2() {
        return "/firstDemoJSP/firstDemo_result.jsp";
    }

    @RequestMapping ("/third.action")
    public String test3() {
        return "redirect:/firstDemoJSP/firstDemo_result.jsp";
    }


}
