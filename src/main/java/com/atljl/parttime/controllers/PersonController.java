package com.atljl.parttime.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/person")
public class PersonController {


    @RequestMapping("/")
    public String PersonPage()
    {
        return "person";
    }
}
