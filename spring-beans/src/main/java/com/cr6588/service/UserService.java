package com.cr6588.service;

import java.util.List;

import com.cr6588.bean.User;

/**
 * create in 2018年04月16日
 * @category TODO
 * @author chenyi
 */
public interface UserService {

    List<User> getUserList(User user);

    Long saveUser(User user);
}
