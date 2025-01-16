package com.souei.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@Autowired
    private HelloService helloService;
	
	
	@RequestMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("hello", "Hello World!");
		return "hello";
	}

	@RequestMapping("/helloWorld")
	public String helloworld(Model model) {
		model.addAttribute("scope", "この文字列が表示されます！");
		return "fileName";
	}

	@RequestMapping(value = "emp")
	public String init(Model model) {

		List<HelloBean> list = helloService.selectName();
		model.addAttribute("list", list);

		return "emp";
	}
}
