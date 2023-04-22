package com.first.blog.controller.api;

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
    @PostMapping("/api/register")
    public String registerProc(@RequestBody RegisterDTO registerDTO) {
        System.out.println("회원가입처리 완료: " + registerDTO.toString());
       User user =  userService.save(registerDTO);
       return "회원가입성공";
    }
}
