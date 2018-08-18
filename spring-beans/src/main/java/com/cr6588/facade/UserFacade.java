package com.cr6588.facade;

import java.util.List;

import com.cr6588.bean.RequestResult;
import com.cr6588.bean.User;

/**
 * create in 2018年04月24日
 * @category TODO
 * @author chenyi
 */
public interface UserFacade {

    List<User> getUserList(User user);

    RequestResult<String> regis(User user);
}
