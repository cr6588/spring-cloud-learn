package com.cr6588.facade.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cr6588.bean.User;
import com.cr6588.facade.UserFacade;
import com.cr6588.service.UserService;

/**
 * create in 2018年04月24日
 * @category TODO
 * @author chenyi
 */
@Service("userFacade")
public class UserFacadeImpl implements UserFacade {

    @Autowired
    private UserService userService;

    @Override
    public List<User> getUserList() {
        return userService.getUserList();
    }

}
