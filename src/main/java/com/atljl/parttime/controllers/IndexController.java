package com.atljl.parttime.controllers;

import com.atljl.parttime.model.User;
import com.atljl.parttime.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    userService userServices;
    @RequestMapping("/index")
    public String index(HttpSession session)
    {
        List<User> userList=userServices.getListUser();
        session.setAttribute("userlist",userList);
        return "index";
    }
}
