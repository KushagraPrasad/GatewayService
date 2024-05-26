package com.gateway.dto;

public class LoginResponse {

	private String token;

	private long expiresIn;

	private String email;

	private String name;

	private String mobile;

	private String role;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public long getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(long expiresIn) {
		this.expiresIn = expiresIn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public LoginResponse(String token, long expiresIn, String email, String name, String mobile, String role) {
		super();
		this.token = token;
		this.expiresIn = expiresIn;
		this.email = email;
		this.name = name;
		this.mobile = mobile;
		this.role = role;
	}

	public LoginResponse() {
		super();
	}

}
