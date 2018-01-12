package com.wang.sys.model;

import javax.persistence.Table;

/**
 * 后台管理员
 * 
 * @author Administrator
 *
 */
@Table(name = "sys_role")
public class Role {
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 角色
	 */
	private String roleType;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 票据
	 */
	private String tgt;
	/**
	 * 状态
	 */
	private Integer status;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTgt() {
		return tgt;
	}

	public void setTgt(String tgt) {
		this.tgt = tgt;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
