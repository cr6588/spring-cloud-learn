package com.cr6588.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cr6588.bean.User;
import com.cr6588.dao.UserDao;
import com.cr6588.service.UserService;

/**
 * create in 2018年04月16日
 * @category TODO
 * @author chenyi
 */
// spring注解
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserList(User user) {
        return userDao.getUserList(user);
    }

    @Override
    public Long saveUser(User user) {
        userDao.saveUser(user);
        return user.getId();
    }

}
