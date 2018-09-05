package company.simpleshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

	public HomeController() {
		
	}
	
	@RequestMapping("/")
	public String Index() {
		
		return "index";
	}
}
