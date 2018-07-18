package com.miller.shiro.service.impl;

import com.miller.shiro.mapper.UserMapper;
import com.miller.shiro.model.User;
import com.miller.shiro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by miller on 2018/7/18
 */
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}
