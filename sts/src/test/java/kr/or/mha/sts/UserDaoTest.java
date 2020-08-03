package kr.or.mha.sts;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.or.mha.sts.dao.UserDAOImpl;
import kr.or.mha.sts.dto.UserVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/applicationContext.xml")
public class UserDaoTest {
	private static final Logger log = LoggerFactory.getLogger(UserDaoTest.class); 
	
	@Autowired
	private UserDAOImpl userDao;
	
	@Test
	public void findById() {

	}
	
	@Test
	public void create() {
		log.debug("User : test~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		UserVO user = new UserVO("ID004", "1234", "산사람", "admin");
		
		log.debug("User : {} ", user.getId() + ", " + user.getName() + ", " + user.getPassword());
	}

}
