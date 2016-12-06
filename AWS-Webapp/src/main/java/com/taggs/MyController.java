package com.taggs;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@EnableAutoConfiguration 
@Controller
public class MyController {
	public MyController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping("/")
    public String index(Model model) {
        return "home";
    }


}
