package com.cr6588.facade.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cr6588.bean.PubUserRole;
import com.cr6588.bean.RequestResult;
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
    public List<User> getUserList(User user) {
        return userService.getUserList(user);
    }

    @Override
    public RequestResult<String> regis(User user) {
        String password = user.getPassword();
        user.setPassword(null);
        List<User> users = userService.getUserList(user);
        if(null != users && users.size() != 0) {
            return RequestResult.createErr("用户已存在");
        }
        user.setPassword(password);
        userService.saveUser(user);
        return RequestResult.createSucc();
    }

    @Override
    public List<PubUserRole> getPubUserRoleList(Map<String, Object> param) {
        return userService.getPubUserRoleList(param);
    }

    @Override
    public PubUserRole getPubUserRole(Map<String, Object> param) {
        return userService.getPubUserRole(param);
    }

    @Override
    public void savePubUserRole(PubUserRole pubUserRole) {
        userService.savePubUserRole(pubUserRole);
    }

    @Override
    public void updatePubUserRole(PubUserRole pubUserRole) {
        userService.updatePubUserRole(pubUserRole);
    }

    @Override
    public void deletePubUserRole(long id) {
        userService.deletePubUserRole(id);
    }

    
}
