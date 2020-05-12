package kr.or.mha.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.mha.dto.UserVO;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {
	private static final Logger log = LoggerFactory.getLogger(UserDAOImpl.class);
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final String nameSpace = "kr.or.mha.mapper.userMapper";
	
	@Override
	public List<UserVO> selectUser() throws Exception {
		return sqlSession.selectList(nameSpace+".selectUser");
	}
}
