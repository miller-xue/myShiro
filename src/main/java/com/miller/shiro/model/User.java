package com.miller.shiro.model;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by miller on 2018/7/18
 */
@Data
public class User {

    private Integer uid;

    private String username;


    private String password;

    private Set<Role> roles = new HashSet<>();
}
