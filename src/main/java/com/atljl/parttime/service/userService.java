package com.atljl.parttime.service;

import com.atljl.parttime.mapper.userMapper;
import com.atljl.parttime.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class userService implements userMapper {

    @Autowired
    userMapper userMappers;

    @Override
    public boolean getUserByNameB(String username) {
       User user=userMappers.getUserByUserName(username);
       if(user==null)
       {
           return false;
       }
       else {
           return true;
       }
    }

    @Override
    public User getUserById(long id) {

        User user=userMappers.getUserById(id);
        return user;
    }

    @Override
    public User getUserByUserName(String name) {

        User user=userMappers.getUserByUserName(name);
        return user;

    }

    @Override
    public void addUser(User user) {
        userMappers.addUser(user);
    }

    @Override
    public void deleteUserByID(long id) {
        userMappers.deleteUserByID(id);
    }

    @Override
    public void updateUser(User user) {

        userMappers.updateUser(user);

    }

    @Override
    public List<User> getListUser() {
        List<User> list=userMappers.getListUser();
        return list;
    }
}

