package com.example.demo.hello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/wishme")
	public String wishUser() {
		return"<h1> congratuations on your first successful run of springboot.</h1> <hr/>";
	}

}
