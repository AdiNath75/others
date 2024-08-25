package com.usermanage.UserManage.service;

import java.util.List;

import com.usermanage.UserManage.model.User;

public interface UserService {
	
	public boolean save(User user);
	
	public List<User> getAllUsers();
	
	public User getUser(Integer id);
	
	public boolean deleteUser(Integer id);

}
