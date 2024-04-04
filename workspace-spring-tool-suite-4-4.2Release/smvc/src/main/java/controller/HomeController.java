package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/proclicksHome")	
	public String home() {
		System.out.println("This home url");
		return "home";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about us url");
		return "aboutUs";
	}
}
