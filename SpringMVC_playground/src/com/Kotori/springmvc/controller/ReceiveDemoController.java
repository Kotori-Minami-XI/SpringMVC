package com.Kotori.springmvc.controller;

import com.Kotori.domain.User;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class ReceiveDemoController {

    @RequestMapping("getParamsByHttp")
    public String getParamsByHttp(HttpServletRequest httpServletRequest) {
        String id = httpServletRequest.getParameter("id");
        String name = httpServletRequest.getParameter("name");
        System.out.println(id);
        System.out.println(name);
        return "redirect:/receiveDemoJSP/receiveDemo_result.jsp";
    }

    @RequestMapping("autoGetParams")
    public String autoGetParams(Integer id, String name) {
        System.out.println(id);
        System.out.println(name);
        return "redirect:/receiveDemoJSP/receiveDemo_result.jsp";
    }

    /*
    RequestParam 参数：
     - value代表请求中的参数名称，形参名字可以不一样。
     - required则表示这个参数是否必须（默认是True）
     - defaultValue默认值
     */

    @RequestMapping("requestParamsTest")
    public String requestParamsTest(@RequestParam (value = "id", required = false, defaultValue = "100") Integer id, String name) {
        System.out.println(id);
        System.out.println(name);
        return "redirect:/receiveDemoJSP/receiveDemo_result.jsp";
    }

    /*
    采用bean的方式则必须要保证Bean中的成员和提交表单中或者请求地址中的参数名字完全相同
    */
    @RequestMapping("getBean")
    public String getBean(User user) {
        System.out.println(user);
        return "redirect:/receiveDemoJSP/receiveDemo_result.jsp";
    }


    /*
    日期默认使用2020/10/10模式，需要自定义转换器
     */
    @RequestMapping("getDateByConverter")
    public String getDateByConverter(Date date) {
        System.out.println(date);
        return "redirect:/receiveDemoJSP/receiveDemo_result.jsp";
    }


    @RequestMapping("template")
    public String template() {
        return "redirect:/receiveDemoJSP/receiveDemo_result.jsp";
    }

}
