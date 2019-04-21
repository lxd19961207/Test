package com.education.dao.impl;

import java.util.List;

import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import com.education.contant.Contant;
import com.education.dao.I_FindUserDao;
import com.education.entity.Admintor;
//根据login表查询adimntor表
public class I_FindAdmintorDaoImpl implements I_FindUserDao {

	@Override
	public List<Admintor> findUserById(int id) {
		String sql="select * from tb_admintor where login_id=?";
		return Contant.jdbcTemplate.query(sql,new BeanPropertyRowMapper<Admintor>(Admintor.class),id);
	}
	@Test
	public void  Test() {
		System.out.println(findUserById(1));
	}

}
