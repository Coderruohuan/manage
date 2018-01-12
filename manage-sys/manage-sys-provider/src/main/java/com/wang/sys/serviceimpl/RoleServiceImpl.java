package com.wang.sys.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wang.sys.dao.RoleMapper;
import com.wang.sys.model.Role;
import com.wang.sys.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleMapper roleMapper;

	@Override
	public int insert(Role role) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Role findByName(String username) {
		return roleMapper.findByName(username);
	}

}
