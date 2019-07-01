package com.codeup.springblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String index() {
        return "List of posts...";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String show(@PathVariable long id) {
        return "Showing post: " + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String create() {
        return "Showing create post view";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public void insert() {

    }



}