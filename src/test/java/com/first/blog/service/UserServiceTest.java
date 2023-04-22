package com.first.blog.service;

import com.first.blog.repository.UserRepository;
import com.first.blog.vo.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceTest {
    @Autowired
    private UserRepository userRepository;
    private User root;

    @BeforeEach
    void before() {
        root = userRepository.save(new User(1, "root", "1234", "root@naver.com"));
    }

    @Test
    void test() {

        Assertions.assertThat(root.getUsername()).isEqualTo("root");
    }
}
