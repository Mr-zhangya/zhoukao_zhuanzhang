package com.zy.controller;

import com.zy.pojo.User;
import com.zy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/list")
    public String userList(HttpSession session) {
        List<User> userList = userService.selectUser();

        session.setAttribute("userList", userList);
        return "index";
    }

    @ResponseBody
    @RequestMapping("/saveUpdate/{jackId}/{roseId}/{money}")
    public String saveUpdate(@PathVariable("jackId") int jackId, @PathVariable("roseId") int roseId, @PathVariable("money") int money){

        String result = userService.saveUpdate(jackId,roseId,money);
        return result;
    }
}
