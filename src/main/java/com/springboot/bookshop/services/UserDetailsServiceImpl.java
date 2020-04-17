package com.springboot.bookshop.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springboot.bookshop.dao.RoleDao;
import com.springboot.bookshop.dao.UsersDao;
import com.springboot.bookshop.entity.Users;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UsersDao usersDao;
	
	@Autowired
	private RoleDao roleDao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users users = this.usersDao.findUserAccount(username);
		
		if(users == null) {
			System.out.println("User not found!" + username);
			throw new UsernameNotFoundException("User " +  username + "was not found in the database");
		}
		
		System.out.println("Found user: " + username);
		
		//Get list role name (ROLE_ADMIN, ROLE_USER....)
		List<String> roleNames = this.roleDao.getRoleNames(users.getId());
		
		List<GrantedAuthority> grantedList = new ArrayList<GrantedAuthority>();
		
		if(roleNames != null) {
			for (String role : roleNames) {
				GrantedAuthority authority = new SimpleGrantedAuthority(role);
				grantedList.add(authority);
			}
		}
		
		UserDetails userDetails = (UserDetails) new User(
					users.getUserName(),
					users.getPassWord(), 
					grantedList
				);
		
		
		return userDetails;
	}

}
