package com.atljl.parttime.controllers;


import com.atljl.parttime.model.User;
import com.atljl.parttime.service.userService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.math.BigInteger;

@Controller
@RequestMapping("/person")
public class PersonController {

    @Autowired
    userService userServices;

    @RequestMapping("/")
    public String PersonPage()
    {
        return "person";
    }

    @RequestMapping("/info")
    public String PersonInfo(Model model, HttpSession httpSession)
    {
        model.addAttribute("user",httpSession.getAttribute("user"));
        return "person-info";
    }

    @PostMapping("/info/modifty")
    public String PersonInfoModifty(@RequestParam("realname") String realname,
                                    @RequestParam("usersex") String usersex,
                                    @RequestParam("userexperience") String userexperience,
                                    @RequestParam("usernumber") String usernumber,
                                    HttpSession session
    )
    {
        User user=(User)session.getAttribute("user");
        user.setRealname(realname);
        user.setSex(usersex);
        user.setUserexperience(userexperience);
        user.setUsernumber(Long.parseLong(usernumber));
        userServices.updateUser(user);
        return "redirect:/person/info";
    }
}
