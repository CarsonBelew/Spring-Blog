package com.codeup.springblog.controller;

import com.codeup.springblog.model.Post;
import com.codeup.springblog.repos.PostRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class PostController {

    private PostRepository postDao;

    public PostController (PostRepository postDao) {
        this.postDao = postDao;
    }

    @GetMapping(path = "/post")
    public String post(Model model) {
        model.addAttribute("posts", postDao.findAll());
        return "posts/index";
    }

    @GetMapping(path = "/post/{id}")
    public int postID(@PathVariable int id) {
        return id;
    }

    @GetMapping(path = "/post/create")
    public String viewPost() {
        return "View form for creating post";
    }

    @GetMapping(path = "post/{id}/delete")
    public String  deletePost(@PathVariable long id) {
        postDao.delete(id);
        return "redirect:/posts";
    }


    }