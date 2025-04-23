package com.practicas.springjwt.Auth;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
	@PostMapping(value = "login")
	public String login() {
		return "Login desde endpoint publico";
	}
	
	@PostMapping(value = "registrer")
	public String registrer() {
		return "Registrer desde endpoint publico";
	}
}
