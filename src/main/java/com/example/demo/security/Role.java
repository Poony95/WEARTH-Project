package com.example.demo.security;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public enum Role {
	GUEST("GUEST", "손님"),
	USER("USER", "일반 사용자"),
	ADMIN("ADMIN", "관리자");
	
	private final String key;
	private final String title;
	public String getKey() {
		return key;
	}
	public String getTitle() {
		return title;
	}
	private Role(String key, String title) {
		this.key = key;
		this.title = title;
	}
	
	
	
	
}

