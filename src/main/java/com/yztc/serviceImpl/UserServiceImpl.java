package com.yztc.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.yztc.dao.UserDao;
import com.yztc.po.User;
import com.yztc.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	public UserDao userDao;
	
	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

}
