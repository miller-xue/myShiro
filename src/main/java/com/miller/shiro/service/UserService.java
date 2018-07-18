package com.miller.shiro.service;

import com.miller.shiro.model.User;

/**
 * Created by miller on 2018/7/18
 */
public interface UserService {
    User findByUsername(String username);
}
