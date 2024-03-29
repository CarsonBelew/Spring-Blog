package com.codeup.springblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/homecontroller")
    @ResponseBody
    public String landing(){
        return "/post";
    }

    @GetMapping("/home")
    public String welcome(Model model){
        model.addAttribute("username", "Fred");
        return "home";
    }

}