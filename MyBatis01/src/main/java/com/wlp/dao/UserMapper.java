package com.wlp.dao;

import com.wlp.pojo.User;

import java.util.List;

/**
 * @author wlp
 * @create 2021-03-29 16:13
 */
public interface UserMapper {
    List<User> getUserList();
}
