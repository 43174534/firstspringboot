package com.neusoft.firstspringboot.service;

import com.neusoft.firstspringboot.mapper.UserMapper;
import com.neusoft.firstspringboot.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: wudagai
 * @date: 2021/11/23 10:42
 * @description:
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public Users queryUser(Integer id){

        return  userMapper.querMsg(id);
    }


    public void updateMsg(Users users) {
        this.userMapper = userMapper;
    }
}
