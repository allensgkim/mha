package com.shi.pms.dao;

import java.util.List;

import com.shi.pms.dto.UserVO;

public interface UserDAO {
	public List<UserVO> selectUser() throws Exception;
}
