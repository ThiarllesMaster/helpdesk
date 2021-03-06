package com.thiarlles.helpdesk.security.jwt;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class JwtUser implements UserDetails{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7455605739927407272L;
	private final String id;
	private final String username;
	private final String password;
	private final Collection<? extends GrantedAuthority>authorities;
	
	
	public JwtUser(String id, String username, String password, Collection<? extends GrantedAuthority> authorities) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.authorities = authorities;
	}


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}


	@JsonIgnore 
	@Override
	public String getPassword() {
		return password;
	}
	
	@JsonIgnore
	public String getId() {
		return id;
	} 

	@Override
	public String getUsername() {
		return username;
	}


	@Override
	public boolean isAccountNonExpired() {
		return false;
	}


	@Override
	public boolean isAccountNonLocked() {
		return false;
	}


	@JsonIgnore
	@Override
	public boolean isCredentialsNonExpired() {
		return false;
	}


	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	

}
