package com.shi.pms.service;

import java.util.List;

import com.shi.pms.dto.UserVO;

public interface UserService {
	public List<UserVO> selectUser() throws Exception;
}
