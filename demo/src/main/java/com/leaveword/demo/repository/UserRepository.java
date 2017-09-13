package com.leaveword.demo.repository;

import com.leaveword.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>{
    User findByUserName(String userName);
}
