package com.bmx.kucun.controller;


import com.bmx.kucun.entity.User;
import com.bmx.kucun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author pingwazi
 * @description
 */
@RestController()
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private UserService userService;
    @GetMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        return userService.login(username,password);
    }

    @GetMapping("/getUser")
    public User getUser(HttpServletRequest request) {
        SecurityContextHolder.getContext().getAuthentication().getDetails();

        return userService.getUser(request.getHeader("token"));
    }
}
