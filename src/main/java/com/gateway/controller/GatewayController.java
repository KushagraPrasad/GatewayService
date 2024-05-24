package com.gateway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.gateway.dto.LoginResponse;
import com.gateway.dto.LoginUserDto;
import com.gateway.dto.RegisterUserDto;

import reactor.core.publisher.Mono;

@CrossOrigin
@RequestMapping("/auth")
@RestController
public class GatewayController {

	private final WebClient.Builder webClientBuilder;

	private static final String AUTH_SERVICE_URL = "http://localhost:4001/auth";

	@Autowired
	public GatewayController(WebClient.Builder webClientBuilder) {
		this.webClientBuilder = webClientBuilder;
	}

	@PostMapping("/signup")
	public Mono<ResponseEntity<Void>> signup(@RequestBody RegisterUserDto registerUserDto) {
		return webClientBuilder.build().post().uri(AUTH_SERVICE_URL + "/signup").bodyValue(registerUserDto).retrieve()
				.toBodilessEntity();
	}

	@PostMapping("/login")
	public Mono<ResponseEntity<LoginResponse>> login(@RequestBody LoginUserDto loginUserDto) {
		return webClientBuilder.build().post().uri(AUTH_SERVICE_URL + "/login").bodyValue(loginUserDto).retrieve()
				.bodyToMono(LoginResponse.class).map(ResponseEntity::ok);
	}
}
