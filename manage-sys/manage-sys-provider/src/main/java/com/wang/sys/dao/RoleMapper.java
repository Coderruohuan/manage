package com.wang.sys.dao;

import org.apache.ibatis.annotations.Param;

import com.wang.sys.model.Role;

public interface RoleMapper {

	Role findByName(@Param("username") String username);

}
