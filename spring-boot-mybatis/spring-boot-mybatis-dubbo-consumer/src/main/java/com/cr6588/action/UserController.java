package com.cr6588.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cr6588.bean.User;
import com.cr6588.facade.UserFacade;

/**
 * create in 2018年04月16日
 * @category TODO
 * @author chenyi
 */
@RestController
public class UserController {

    @Reference
    private UserFacade userFacade;

    @RequestMapping("/getUserList")
    List<User> get() {
        return userFacade.getUserList();
    }
}
