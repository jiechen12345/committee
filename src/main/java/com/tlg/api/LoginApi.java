package com.tlg.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import java.util.Map;

/**
 * Created by jiechen on 2018/7/23.
 */
@Controller
public class LoginApi {

    @PostMapping(value ="/login")
    public String login(@RequestParam("account") String account, @RequestParam("password") String password
            ,Map<String, Object> map) {
        if (!StringUtils.isEmpty(account) && "123".equals(password)) {
            return "websiteMgt";
        } else {
            map.put("msg","帳號或密碼錯誤");
            return "index";
        }
    }
}
