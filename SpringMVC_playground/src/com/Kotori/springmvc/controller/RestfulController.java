package com.Kotori.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestfulController {

    /*
     * 一定要用@PathVariable表明接受的资源标识
     */
    @RequestMapping("/rest/{id}")
    public String testRestfulRequest(@PathVariable String id) {
        System.out.println("testRestfulRequest");
        System.out.println(id);
        return "/restfulDemoJSP/restfulDemo_result.jsp";
    }

    /*
    * JSP只能接受get post请求，所以如果这是一个delete或者put请求，最后只能重定向
    */
    @RequestMapping(value="/rest2/{id}", method = RequestMethod.PUT)
    public String testPutMethod(@PathVariable String id) {
        System.out.println("testPutMethod");
        System.out.println(id);
        return "redirect:/restfulDemoJSP/restfulDemo_result.jsp";
    }

    @RequestMapping("/testHeader.action")
    public String testHeader(@RequestHeader("Host") String host, @RequestHeader("Referer") String referer)
    {
        System.out.println(host);
        System.out.println(referer);
        return "redirect:/restfulDemoJSP/restfulDemo_result.jsp";
    }

    @RequestMapping("/testCookie.action")
    public String testCookie(@CookieValue("JSESSIONID") String sessionId)
    {
        System.out.println(sessionId);
        return "redirect:/restfulDemoJSP/restfulDemo_result.jsp";
    }

}
