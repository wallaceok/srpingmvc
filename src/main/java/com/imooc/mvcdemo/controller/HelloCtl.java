package com.imooc.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HelloCtl {
	
	@RequestMapping(value="/hello")  
    public String HelloWorld(Model model){  
        model.addAttribute("message","Hello World!!!");  
        return "home";
	}
	
}
