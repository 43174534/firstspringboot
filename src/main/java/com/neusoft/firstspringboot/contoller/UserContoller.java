package com.neusoft.firstspringboot.contoller;

import com.neusoft.firstspringboot.pojo.Users;
import com.neusoft.firstspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/user")
public class UserContoller {

    @Autowired
    private UserService userService;

    @Value("${server.servlet.context-path}")
    private String contextPathj;

    @RequestMapping("/query")
    public Users query(Integer id){
        return userService.queryUser(id);
    }



}






