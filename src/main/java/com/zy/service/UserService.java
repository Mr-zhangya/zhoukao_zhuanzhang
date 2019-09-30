package com.zy.service;

import com.zy.pojo.User;

import java.util.List;

public interface UserService {
    List<User> selectUser();
    String saveUpdate(int jackId, int roseId, int money);
}
