package com.atljl.parttime;

import com.atljl.parttime.mapper.userMapper;
import com.atljl.parttime.model.User;
import com.atljl.parttime.service.userService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParttimeApplicationTests {

    @Autowired
    userService service;
    @Test
    public void contextLoads() {
    }

    @Test
    public void test1()
    {
        User user=new User();
        user.setAge(20);
        user.setID(2);
        user.setUsername("张三");
        user.setSex("男");
        user.setUserpassword("1234567");
        service.updateUser(user);


    }

}
