package com.miller.shiro.model;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by miller on 2018/7/18
 */
@Data
public class Role {

    private Integer rid;

    private String rname;

    private Set<Permission> permissions = new HashSet<>();


    private Set<User> users = new HashSet<>();

}
