package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cek")
public class HelloWorld {
	
	public String helloWorld(Model model) {
		model.addAttribute("test", "HelloWorld!");
		return "hello";
	}

}
