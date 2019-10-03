package com.atljl.parttime.controllers;

import com.atljl.parttime.model.User;
import com.atljl.parttime.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    userService service;

    @RequestMapping("/")
    public String Login() {
        return "login";
    }


    @RequestMapping("/user")
    public String userLogin(@RequestParam("username") String username,
                            @RequestParam("userpassword") String userpassword,
                            HttpSession session,
                            Model model
    ) {
        User user = service.getUserByUserName(username);
        if (user != null && userpassword.equals(user.getUserpassword()))
        {

           session.setAttribute("user",user);
            //session.setAttribute("username","hello"+username);
            return "redirect:/index";
        }

        else {
            model.addAttribute("msg","用户名或密码错误！");

            return "login";
        }
    }
}
