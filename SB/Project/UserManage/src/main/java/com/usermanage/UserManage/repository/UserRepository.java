package com.usermanage.UserManage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usermanage.UserManage.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	
}
