package com.leaveword.demo.service;

import com.leaveword.demo.Utils.Response;

public interface UserService {

    Response getUser(Integer userId);
    Response userRegister(String userName,String userPassword);
    Response userLogin(String userName,String userPassword);
}
