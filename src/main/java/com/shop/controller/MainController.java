package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(value = "/")
    public String main(){
        return "main";
    }

    @GetMapping(value = "/apis")
    public String apis(){
        return "redirect:/swagger-ui/index.html";
    }
}
