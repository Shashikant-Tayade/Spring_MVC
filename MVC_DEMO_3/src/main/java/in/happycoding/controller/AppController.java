package in.happycoding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController
{
	@RequestMapping("/")
	public String indexPage()
	{
		return "index";
		
	}
	
	@RequestMapping("/message")
	public String message()
	{
		return "message";
		
	}
	
	@RequestMapping("/greet")
	public String greet()
	{
		return "greet";
		
	}
}
