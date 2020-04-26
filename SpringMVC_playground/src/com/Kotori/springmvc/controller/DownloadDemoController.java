package com.Kotori.springmvc.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.net.URLEncoder;

@Controller
public class DownloadDemoController {
    @RequestMapping("downloadFile/{filename}.+")
    public ResponseEntity downloadFile(@PathVariable String filename, HttpSession session) throws IOException {
        URLEncoder.encode(filename, "UTF-8");
        System.out.println(filename);
        String path = session.getServletContext().getRealPath("/download/" + filename);

        InputStream in = new FileInputStream(path);
        byte[] body = new byte[in.available()];
        in.read(body);

        HttpHeaders httpHeader = new HttpHeaders();
        httpHeader.add("Content-Disposition", "attachment;filename="+filename);

        ResponseEntity<byte[]> responseEntity = new ResponseEntity(body, httpHeader, HttpStatus.OK);

        return responseEntity;
    }
}
