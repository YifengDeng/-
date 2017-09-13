package com.leaveword.demo.controller;


import com.leaveword.demo.Utils.Response;
import com.leaveword.demo.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class WordController {
@Autowired
WordService wordService;


//留言//
@PostMapping(value = "/leaveWord")
    public Response leaveWord(@RequestParam("userId")Integer userId,
                              @RequestParam("title")String title,
                              @RequestParam("content")String content){
    return wordService.leaveWord(userId,title,content);
}

//获取所有留言//
@PostMapping(value = "/getWords")
public Response getWords(@RequestParam("userId")Integer userId){
    return wordService.getWords(userId);
}

}
