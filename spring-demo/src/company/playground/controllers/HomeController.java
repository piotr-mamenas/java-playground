package company.playground.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	public HomeController() {	
	}
	
	@RequestMapping("/")
	public String Index() {
		return "";
	}
}
