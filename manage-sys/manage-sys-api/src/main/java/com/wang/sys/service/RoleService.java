package com.wang.sys.service;

import com.wang.sys.model.Role;

public interface RoleService {

	int insert(Role role);

	Role findByName(String username);

}
