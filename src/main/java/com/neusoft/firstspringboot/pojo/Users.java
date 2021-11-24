package com.neusoft.firstspringboot.pojo;

import lombok.Data;

/**
 * @author: wudagai
 * @date: 2021/11/23 16:21
 * @description:
 */
@Data
public class Users {
    private Integer userId;
    private String phone;
    private String userName;
    private Integer userSex;
}
