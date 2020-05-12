package kr.or.mha.service;

import java.util.List;

import kr.or.mha.dto.UserVO;

public interface UserService {
	public List<UserVO> selectUser() throws Exception;
}
