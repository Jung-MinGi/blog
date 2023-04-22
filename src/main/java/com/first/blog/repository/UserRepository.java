package com.first.blog.repository;

import com.first.blog.vo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUsernameAndPassword(String username,String password);
}
