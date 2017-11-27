package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String loadMain()
    {
        return "index";
    }
    @RequestMapping("/page2")
    public String loadPage2()
    {
        return "page2";
    }
    @RequestMapping("/page3")
    public String loadPage3()
    {
        return "page3";
    }
}
