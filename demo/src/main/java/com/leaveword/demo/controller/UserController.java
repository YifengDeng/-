package com.leaveword.demo.controller;

import com.leaveword.demo.Utils.Response;
import com.leaveword.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration

public class UserController {

    @Autowired
    UserService userService;

    //注册新用户//

    @PostMapping(value = "/userRegister")
    public Response userRegister(@RequestParam("userName")String userName,
                                 @RequestParam("userPassword")String userPassword){
        return userService.userRegister(userName,userPassword);
    }

    //根据userId获取用户//

    @PostMapping(value = "/getUser")
    public Response getUser(@RequestParam("userId")Integer userId){
        return userService.getUser(userId);
    }

    //用户登陆//
    @PostMapping(value = "/userLogin")
    public Response userLogin(@RequestParam("userName")String userName,
                                 @RequestParam("userPassword")String userPassword){
        return userService.userLogin(userName,userPassword);
    }



}
