package com.revature.associate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class RasDetailsService implements UserDetailsService{

	@Autowired
	AssociateRepository assocRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Associate associate = assocRepo.findByUsername(username);
		if(associate == null){
			throw new UsernameNotFoundException(username + " was not found");
		}
		return new org.springframework.security.core.userdetails.User(
				username, associate.getPassword(), AuthorityUtils.createAuthorityList(associate.getRoles()));
	}

}
