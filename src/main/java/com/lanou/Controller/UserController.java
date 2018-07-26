package com.lanou.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    // 2018年07月26日17:17:03
    @RequestMapping(value = "login")
    public String login(){
        return "login";
    }

}