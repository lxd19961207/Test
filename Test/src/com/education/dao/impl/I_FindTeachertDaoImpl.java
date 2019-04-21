package com.education.dao.impl;

import java.util.List;

import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import com.education.contant.Contant;
import com.education.dao.I_FindUserDao;
import com.education.entity.Teacher;
//根据login表查询teacher表
public class I_FindTeachertDaoImpl implements I_FindUserDao{

	@Override
	public List<Teacher> findUserById(int id) {
          String   sql="select * from tb_teacher where login_id=?";
          return   Contant.jdbcTemplate.query(sql,new BeanPropertyRowMapper<Teacher>(Teacher.class),id);
	}
//	@Test
//	public void  Test() {
//		System.out.println(findUserById(2).get(0));
//	}

}
