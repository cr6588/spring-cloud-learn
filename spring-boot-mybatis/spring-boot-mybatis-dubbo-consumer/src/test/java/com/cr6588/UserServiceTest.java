package com.cr6588;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cr6588.service.UserService;

/**
 * create in 2018年04月19日
 * @category TODO
 * @author chenyi
 */
@RunWith(SpringRunner.class)
@SpringBootTest(properties = "spring.profiles.active=dev")
//(@SpringBootTest 1.5.10中默认先读取src/main/resources中的application.properties文件（yml文件不会读取），若没有读取src/test/resources中的application.properties文件.App的main方法中指定读取application-dev.properties但使用classes=App.class指定后无用)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void userServiceTest() {
        userService.getUserList();
    }

}
