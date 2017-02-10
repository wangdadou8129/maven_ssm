package com.yztc.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yztc.po.User;


public interface UserService {
	public List<User> findAll();
}
