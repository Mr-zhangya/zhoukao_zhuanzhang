package com.zy.service.Impl;

import com.zy.mapper.UserMapper;
import com.zy.pojo.User;
import com.zy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> selectUser() {
        return userMapper.selectUser();
    }

    @Override
    public String saveUpdate(int jackId, int roseId, int money) {
        User user = new User();
        user.setId(jackId);
        user.setMoney(-money);

        int count01 = userMapper.saveUpdate(user);


        user.setId(roseId);
        user.setMoney(money);

        int count02 = userMapper.saveUpdate(user);

        if (count01 > 0 && count02 > 0) {
            return "success";
        }
        return "fail";
    }
}
