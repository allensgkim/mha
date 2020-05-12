package kr.or.mha.dao;

import java.util.List;

import kr.or.mha.dto.UserVO;

public interface UserDAO {
	public List<UserVO> selectUser() throws Exception;
}
