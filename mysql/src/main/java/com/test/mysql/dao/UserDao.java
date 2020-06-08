package com.test.mysql.dao;

import com.test.mysql.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    public User getUsers();
}
