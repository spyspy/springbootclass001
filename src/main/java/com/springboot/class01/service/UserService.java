package com.springboot.class01.service;

import com.springboot.class01.dao.User;
import com.springboot.class01.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;
    public List<User> queryUserList(){
        return userDao.queryList();
    }
}
