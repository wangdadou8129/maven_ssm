package com.yztc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yztc.po.User;

@Repository
public interface UserDao {
	public List<User> findAll();
}
