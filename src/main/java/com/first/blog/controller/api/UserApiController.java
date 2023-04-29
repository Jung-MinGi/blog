package com.first.blog.controller.api;

import com.first.blog.dto.user.LoginDTO;
import com.first.blog.dto.user.RegisterDTO;
import com.first.blog.service.UserService;
import com.first.blog.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiController {
@Autowired
private UserService userService;
    @PostMapping("/api/user")
    public String register(@RequestBody RegisterDTO registerDTO) {
        System.out.println("회원가입처리 완료: " + registerDTO.toString());
       User user =  userService.save(registerDTO);
       return "회원가입성공";
    }
    @PostMapping("/api/user/login")
    public User lgoin(@RequestBody LoginDTO loginDTO) {
        System.out.println("로그인 완료: " + loginDTO.toString());
        User user = userService.findByUsernameAndPassword(loginDTO);
        System.out.println("db조회값: "+user.toString());
        return user;
    }
}

