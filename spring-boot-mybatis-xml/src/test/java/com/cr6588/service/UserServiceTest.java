package com.cr6588.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * create in 2018年04月19日
 * @category TODO
 * @author chenyi
 */
@RunWith(SpringRunner.class)
@SpringBootTest
//@Rollback // 事务会回滚
//@MapperScan("com.cr6588.dao")

public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void userServiceTest() {
        userService.getUserList();
    }

}
