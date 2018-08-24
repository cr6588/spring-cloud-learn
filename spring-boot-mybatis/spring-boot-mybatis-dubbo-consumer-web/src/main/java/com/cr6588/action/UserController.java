package com.cr6588.action;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/user")
public class UserController {

    //userFacade在provider未启动时，为null，无法自动重连。当成功连过一次之后provider被断开，再重启provider可以重连
    @Reference
    private UserFacade userFacade;

    @RequestMapping("/login")
    public RequestResult<String> login(@Valid @RequestBody User u, BindingResult result) {
        if(result.hasErrors()) {
            return RequestResult.createErr(result.getAllErrors().get(0).getDefaultMessage());
        }
        List<User> users = userFacade.getUserList(u);
        if(users != null && users.size() == 1) {
            return RequestResult.createSucc();
        }
        return RequestResult.createErr("用户名或密码错误");
    }

    @RequestMapping("/regis")
    public RequestResult<String> regis(@Valid @RequestBody User u, BindingResult result) {
        if(result.hasErrors()) {
            return RequestResult.createErr(result.getAllErrors().get(0).getDefaultMessage());
        }
        return userFacade.regis(u);
    }
}
