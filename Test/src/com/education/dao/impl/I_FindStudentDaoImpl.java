package com.education.dao.impl;

import java.util.List;

import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import com.education.contant.Contant;
import com.education.dao.I_FindUserDao;
import com.education.entity.Student;
//根据login表查询student表
public class I_FindStudentDaoImpl  implements  I_FindUserDao {

	@Override
	public List<Student> findUserById(int id) {
		String  sql="select * from tb_stu where login_id=?";
		return Contant.jdbcTemplate.query(sql, new BeanPropertyRowMapper<Student>(Student.class),id);
	}
//	@Test
//	public void  Test() {
//		System.out.println(findUserById(4));
//	}

}
