package com.shi.pms.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UserVO {
	private String id;
	private String password;
	private String name;
	private String role;

	public UserVO() {
	}

	public UserVO(String id, String password, String name, String role) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.role = role;
	}

	@NotEmpty @Size(min=2, max=20) 
	public String getId() {
		return id;
	}

	@NotEmpty
	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserVo [id=" + id + ", password=" + password + ", name=" + name + ", role=" + role + "]";
	}
	
}
