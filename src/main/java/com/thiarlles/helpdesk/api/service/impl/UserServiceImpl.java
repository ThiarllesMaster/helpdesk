package com.thiarlles.helpdesk.api.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.thiarlles.helpdesk.api.entity.User;
import com.thiarlles.helpdesk.api.repository.UserRepository;
import com.thiarlles.helpdesk.api.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public User createOrUpdate(User user) {
		return userRepository.save(user);
	}

	@Override
	public Optional<User> findById(String id) {
		return userRepository.findById(id);
	}

	@Override
	public void delete(String id) {
	 this.userRepository.deleteById(id);
		
	}

	@Override
	public Page<User> findAll(int page, int count) {
		Pageable paginas = new PageRequest(page, count);
		return this.userRepository.findAll(paginas);
	}
	
	

}
