package com.neusoft.firstspringboot.mapper;

import com.neusoft.firstspringboot.pojo.Users;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author: wudagai
 * @date: 2021/11/23 16:21
 * @description:
 */
@Mapper
public interface UserMapper {
//    @Select("select * from elm_user where userid=#{id}")
    public Users querMsg(Integer id);


    public Users updateMsg(Users users);

}



