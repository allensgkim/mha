package kr.or.mha.sts.service;

import java.util.List;

import kr.or.mha.sts.dto.UserVO;

public interface UserService {
	public List<UserVO> selectUser() throws Exception;
}
