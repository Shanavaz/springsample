package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHi() {
		String hei = sayHii();
		return hei;
	}
	
//	@RequestMapping("/hello")
	public String sayHii() {
		return "hey";
	}
}
