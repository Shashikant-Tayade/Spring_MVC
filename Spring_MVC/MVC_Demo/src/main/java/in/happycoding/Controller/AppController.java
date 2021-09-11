package in.happycoding.Controller;

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
	
	@RequestMapping("/Message")
	public String MessgePage()
	{
		return "Message";
		
	}
	
}
