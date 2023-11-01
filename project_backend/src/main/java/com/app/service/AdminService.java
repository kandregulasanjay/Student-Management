package com.app.service;

import com.app.pojos.Admin;

public interface AdminService {
	Admin authenticateUser(String email, String pass);
	int updatePassword(String id,String password);
}
