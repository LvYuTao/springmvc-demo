package cn.itlaobing.springmvc.web.controller;

import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello(Model model){
		model.addAttribute("msg", "hello spring!"+UUID.randomUUID().toString());
		return "hello";
	}

}
