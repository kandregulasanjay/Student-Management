package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Repository.AdminRepository;
import com.app.pojos.Admin;


@Service
@Transactional 
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminRepository adminrepo;

	@Override
	public Admin authenticateUser(String email, String pass) {
	
		return adminrepo.findByUsernameAndPassword(email, pass)
				.orElseThrow(() -> new RuntimeException("User login failed : Invalid Credentials"));
	}
	@Override
	public int updatePassword(String id, String password) {
	return adminrepo.updatePassword(password, id);
	}
}
