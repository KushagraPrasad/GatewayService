package com.gateway.dto;

public class RegisterUserDto {

	private String email;
	private String password;
	private String name;
	private String mobile;
	private String role;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public RegisterUserDto(String email, String password, String name, String mobile, String role) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.mobile = mobile;
		this.role = role;
	}

	public RegisterUserDto() {
	}
}
