package com.cr6588.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cr6588.facade.UserFacade;

/**
 * create in 2018年04月16日
 * @category TODO
 * @author chenyi
 */
@Controller
public class UserController {

    @Reference
    private UserFacade userFacade;

    @RequestMapping("/getUserList")
    public ModelAndView get(ModelAndView view) {
        view.addObject("users", userFacade.getUserList());
        return view;
    }
}
