package kr.or.mha;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.or.mha.dao.UserDao;
import kr.or.mha.vo.UserVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/applicationContext.xml")
public class UserDaoTest {
	private static final Logger log = LoggerFactory.getLogger(UserDaoTest.class); 
	
	@Autowired
	private UserDao userDao;
	
	@Test
	public void findById() {
		UserVo user = userDao.findById("ID001");
		log.debug("User : {} ", user.getId() + ", " + user.getName());
	}
	
	@Test
	public void create() {
		log.debug("User : test~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		UserVo user = new UserVo("ID004", "1234", "산사람", "admin");
		userDao.create(user);
		UserVo userVo = userDao.findById(user.getId());
		
		log.debug("User : {} ", user.getId() + ", " + user.getName() + ", " + user.getPassword());
	}

}
