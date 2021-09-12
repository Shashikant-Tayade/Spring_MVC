package in.happycoding.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.happycoding.Config.Config;
import in.happycoding.bean.Date;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Date date = context.getBean("date", Date.class);
		System.out.println(date);
	
	}
	
	
	
}
