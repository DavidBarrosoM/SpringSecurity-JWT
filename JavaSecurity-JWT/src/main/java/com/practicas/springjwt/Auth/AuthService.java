package com.practicas.springjwt.Auth;


import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.practicas.springjwt.User.Role;
import com.practicas.springjwt.User.User;
import com.practicas.springjwt.User.UserRepository;
import com.practicas.springjwt.jwt.JwtService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {
	
	private final UserRepository userRepository;
	private final JwtService jwtService;
	private final PasswordEncoder passwordEncoder;

	public AuthResponse login(LoginRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public AuthResponse register(RegisterRequest request) {
		User user = User.builder()
				.username(request.getUsername())
				.password(request.getPassword())
				.firstName(request.getFirstName())
				.lastName(request.getLastName())
				.country(request.getCountry())
				.role(Role.USER)
				.build();
		userRepository.save(user);
		return AuthResponse.builder()
				.token(jwtService.getToken(user))
				.build();
	}

}
