package com.usermanage.UserManage.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usermanage.UserManage.constant.UserConstant;
import com.usermanage.UserManage.model.User;
import com.usermanage.UserManage.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;
	

	@Override
	public boolean save(User user) {
		user.setIsActive(UserConstant.ISACTIVET);
		User newUser = userRepo.save(user);
		
		if(newUser != null && newUser.getId() != null) {
			return true;
		}
		
		return false;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = userRepo.findAll();
		return users;
	}

	@Override
	public User getUser(Integer id) {
		Optional<User> user = userRepo.findById(id);
		if(user.isPresent()) {
			return user.get();
		}
		return null;
	}

	@Override
	public boolean deleteUser(Integer id) {
		Optional<User> user = userRepo.findById(id);
		
		User user2 = user.get();
		if(user.isPresent()) {
			return true;
		}
		
		return false;
	}

}
