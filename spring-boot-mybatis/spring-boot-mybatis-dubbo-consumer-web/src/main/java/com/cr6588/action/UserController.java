package com.cr6588.action;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cr6588.bean.RequestResult;
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

    @RequestMapping("/login")
    public RequestResult<String> login(@RequestParam("name") Long name, @RequestParam("password") Long password) {
        List<User> users = userFacade.getUserList(null);
        for (User u : users) {
            if(name.equals(u.getUsername()) && password.equals(u.getId())) {
                RequestResult<String> createSucc = RequestResult.createSucc();
                createSucc.setCode(200);;
                return createSucc;
            }
        }
        return RequestResult.createErr("用户名或密码错误");
    }

    @RequestMapping("/regis")
    public RequestResult<String> regis(User u) {
        return userFacade.regis(u);
    }
}
