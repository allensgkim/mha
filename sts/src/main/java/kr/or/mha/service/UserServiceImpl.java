package kr.or.mha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.mha.dao.UserDAO;
import kr.or.mha.dto.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO dao;
	
	@Override
	public List<UserVO> selectUser() throws Exception {
		return dao.selectUser();
	}
}
