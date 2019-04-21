package com.education.dao.impl;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.education.contant.Contant;
import com.education.dao.I_LoginDao;
import com.education.entity.Login;
import com.education.entity.Student;
import com.education.util.JdbcUtils;

public class I_loginDaoImpl  implements I_LoginDao {
//查找对应的用户
	@Override
	public List<Login> loginByUsAndPw(String username, String password) {
		   String sql="select *  from  tb_login where username=? and password=?";
		  return Contant.jdbcTemplate.query(sql, new BeanPropertyRowMapper<Login>(Login.class),username,password);
	}
          
}
