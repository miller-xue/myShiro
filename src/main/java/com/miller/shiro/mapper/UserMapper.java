package com.miller.shiro.mapper;

import com.miller.shiro.model.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by miller on 2018/7/18
 */
public interface UserMapper {

    User findByUsername(@Param("username") String username);
}
