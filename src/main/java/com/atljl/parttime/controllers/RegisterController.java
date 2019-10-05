package com.atljl.parttime.controllers;

import com.atljl.parttime.model.User;
import com.atljl.parttime.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private userService userServices;


    @RequestMapping("/")
    public String register()
    {
        return "register";
    }


    @RequestMapping("/user")
    public String  userRegister(@RequestParam("username") String username,
                                @RequestParam("userpassword") String userpassword,
                                @RequestParam("usersex") String usersex,
                                @RequestParam("userage") String userage,
                                @RequestParam("usernumber") String usernumber,
                                @RequestParam("userexperience") String userexperience,
                                @RequestParam("realname") String realname,
                                HttpServletRequest request,
                                Model model
    )
    {

//        User user=userServices.getUserByUserName(username);
          Boolean flag=userServices.getUserByNameB(username);
          User user=new User();
        if(flag==false)
        {
            user.setUsername(username);
            user.setUserpassword(userpassword);
            user.setAge(Integer.parseInt(userage));
            user.setSex(usersex);
            user.setUserexperience(userexperience);
            user.setUsernumber(Integer.parseInt(usernumber));
            user.setRealname(realname);
            userServices.addUser(user);
            return "login";
        }else
        {
            model.addAttribute("msg2","用户名已存在,请重新输入用户名！");
            return "register";
        }

    }
}
