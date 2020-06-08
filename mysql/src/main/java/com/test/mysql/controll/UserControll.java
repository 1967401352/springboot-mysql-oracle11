package com.test.mysql.controll;

import com.test.mysql.dao.UserDao;
import com.test.mysql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserControll {
    @Resource
    private UserService userService;
    @GetMapping("test")
    public  void tsetMysek() {
        System.out.println(userService.getUsers());
    }
}
