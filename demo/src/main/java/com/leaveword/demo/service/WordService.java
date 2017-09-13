package com.leaveword.demo.service;

import com.leaveword.demo.Utils.Response;

public interface WordService {
    Response getWords(Integer userId);
    Response leaveWord(Integer userId,String title,String content);
}
