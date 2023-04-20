package kr.co.going.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MainController {
	
	@GetMapping("/1")
	public String getMain() {
		
		return "main";
	}
	
	@GetMapping("/2")
	public String getLoginForm() {
		
		return "loginForm";
	}
	
	@GetMapping("/3")
	public String getSignUpForm() {
		
		return "signUpForm";
	}
}
