package com.first.blog.service;

import com.first.blog.dto.user.RegisterDTO;
import com.first.blog.dto.user.UserDTO;
import com.first.blog.repository.UserRepository;
import com.first.blog.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User save(RegisterDTO registerDTO) {
        User user = new User(0,registerDTO.getUsername(),registerDTO.getPassword(),registerDTO.getEmail());
        return userRepository.save(user);
    }
    public User findByUsernameAndPassword(UserDTO userDTO){
        return userRepository.findByUsernameAndPassword(userDTO.getUsername(),userDTO.getPassword());
    }
}
