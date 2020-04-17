package com.springboot.bookshop.ultis;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncrytedPasswordUtils {
	// Encryte Password with BCryptPasswordEncoder
	public static String encrytePasswrod(String password) {
		return new BCryptPasswordEncoder().encode(password);
	}
}
