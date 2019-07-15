package com.example.Login.service;

import javax.validation.Valid;

import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.Login.Exception.UsernameOrIdNotFound;
import com.example.Login.dto.ChangePasswordForm;
import com.example.Login.entity.User;

public interface UserService {

	public Iterable<User> getAllUsers();

	public User createUser(User user) throws Exception;

	public User getUserById(Long id) throws Exception;
	
	public User updateUser(User user) throws Exception;
	
	public void deleteUser(Long id) throws UsernameOrIdNotFound;
	
	public User changePassword(ChangePasswordForm form) throws Exception;
}
