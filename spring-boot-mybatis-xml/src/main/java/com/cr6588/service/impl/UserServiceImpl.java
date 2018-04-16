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
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserList() {
        return userDao.getUserList();
    }

}
