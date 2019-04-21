package com.education.dao.impl;

import org.junit.Test;

import com.education.contant.Contant;
import com.education.dao.I_FindLoginDao;
//查询用户信息
public class I_FindLoginDaoImpl  implements I_FindLoginDao {
 //返回username对应的Login_id
	@Override
	public int findIdByUsername(String username) {
          String sql="select id  from tb_login where username=?";
		return Contant.jdbcTemplate.queryForObject(sql, Integer.class,username);
	}
//返回username对应的type
	@Override
	public String findTypeByUsername(String username) {
		String sql="select type from tb_login where  username=?";
		return Contant.jdbcTemplate.queryForObject(sql, String.class,username);
	}
@Test
public void test() {
	System.out.println(findIdByUsername("1"));
	System.out.println(findTypeByUsername("2"));
}
}
