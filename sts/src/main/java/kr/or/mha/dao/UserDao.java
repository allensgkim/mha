package kr.or.mha.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

import kr.or.mha.HelloController;
import kr.or.mha.vo.UserVo;

public class UserDao extends JdbcDaoSupport{
	private static final Logger log = LoggerFactory.getLogger(UserDao.class);
	
	@PostConstruct
	public void initial() {
		log.info("database initial success!!!!");
	}
	
	public UserVo findById(String id) {
		String sql = "select * from test_users where id = ?";
		RowMapper<UserVo> rowMapper = new RowMapper<UserVo>() {
			@Override
			public UserVo mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new UserVo(
						rs.getString("id"), 
						rs.getString("name"),
						rs.getString("password"),
						rs.getString("role"));
			}
		};
		return getJdbcTemplate().queryForObject(sql, rowMapper, id);
	}

	public void create(UserVo user) {
		String sql = "insert into test_users values (?, ?, ?, ?)";
		getJdbcTemplate().update(sql, user.getId(), user.getPassword(), user.getName(), user.getRole());
	}

}
