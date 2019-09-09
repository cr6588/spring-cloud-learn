package com.cr6588.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * create in 2018年04月16日
 * @category TODO
 * @author chenyi
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/init")
    @ResponseBody
    public String init() {
        return "init success";
    }
}
