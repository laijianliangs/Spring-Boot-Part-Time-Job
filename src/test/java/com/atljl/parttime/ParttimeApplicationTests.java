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
        User user=user=service.getUserById(6);
        user.setRealname("hsauha");


        service.updateUser(user);


    }

}
