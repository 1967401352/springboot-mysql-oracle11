package com.test.mysql.service.impl;

import com.test.mysql.dao.UserDao;
import com.test.mysql.entity.User;
import com.test.mysql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public User getUsers() {
        return userDao.getUsers();
    }
}
