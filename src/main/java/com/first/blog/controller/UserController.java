package com.first.blog.controller;

import com.first.blog.dto.user.UserDTO;
import com.first.blog.service.UserService;
import com.first.blog.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "user/login";
    }

    @GetMapping("/register")
    public String register() {
        return "user/register";
    }

    @GetMapping("/index")
    public String main() {
        return "index";
    }

    @PostMapping("/login")
    public String loginProc(UserDTO userDTO) {
        User principal = userService.findByUsernameAndPassword(userDTO);
        if (principal != null) {
            return "index";

        } else {
            return "user/login";
        }
    }
}
