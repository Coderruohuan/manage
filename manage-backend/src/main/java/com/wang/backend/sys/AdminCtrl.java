package com.wang.backend.sys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.common.Exception.BusinessException;
import com.common.Response.Response;
import com.wang.sys.model.Role;
import com.wang.sys.service.RoleService;

/**
 * 
 * @author wwn
 * @Date 2018/1/10 13:46 </br>
 *       后台管理员
 *
 */
@Controller
@RequestMapping(value = "/api/sys/admin")
public class AdminCtrl {

	@Autowired
	private RoleService roleService;

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public Response addRole(Role role) throws BusinessException {
		Role sameRole = roleService.findByName(role.getUsername());
		if (sameRole != null) {
			throw new BusinessException("已存在该用户了，请换个用户名");
		}
		return new Response("操作成功");
	}

	@RequestMapping(value = "/test")
	public void test() {
		System.out.println("执行成功");
	}
}
