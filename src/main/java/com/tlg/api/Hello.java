package com.tlg.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by JieChen on 2018/7/20.
 */
@Controller
public class Hello {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        System.out.println(1111);
        return "OK";
    }
}
