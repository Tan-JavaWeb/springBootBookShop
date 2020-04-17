package com.springboot.bookshop.ultis;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;



public class WebUltils {

	public static String toString(User user) {
		StringBuilder sb = new StringBuilder();
		sb.append("UserName: ").append(user.getUsername());
		
		Collection<GrantedAuthority> authorities = user.getAuthorities();
		if(authorities != null && !authorities.isEmpty()) {
			sb.append(" (");
			boolean first = true;
			for (GrantedAuthority ga : authorities) {
				if(first) {
					sb.append(ga.getAuthority());
					first = false;
				} else {
					sb.append(", ").append(ga.getAuthority());
				}
			}
			sb.append(")");
		}
		return sb.toString();
	}
}
