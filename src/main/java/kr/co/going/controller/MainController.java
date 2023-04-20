package kr.co.going.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MainController {
	
	@GetMapping("/")
	public String getMain() {
		
		return "main";
	}
	
	@GetMapping("/loginForm")
	public String getLoginForm() {
		
		return "loginForm";
	}
	
	@GetMapping("/signUpForm")
	public String getSignUpForm() {
		
		return "signUpForm";
	}
}
