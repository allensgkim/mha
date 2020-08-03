package kr.or.mha.sts.dao;

import java.util.List;

import kr.or.mha.sts.dto.UserVO;

public interface UserDAO {
	public List<UserVO> selectUser() throws Exception;
}
