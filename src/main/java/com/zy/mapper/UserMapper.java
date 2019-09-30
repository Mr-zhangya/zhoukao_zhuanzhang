package com.zy.mapper;

import com.zy.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> selectUser();

    int saveUpdate(User user);
}
