package com.blog.payloads;

import lombok.Data;

@Data
public class JwtAuthenticationRequest {

	private String username;
	
	private String password;
}
