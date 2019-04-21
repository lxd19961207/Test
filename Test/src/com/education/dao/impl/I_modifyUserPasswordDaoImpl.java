package com.education.dao.impl;

import org.junit.Test;

import com.education.contant.Contant;
import com.education.dao.I_modifyUserPasswordDao;

public class I_modifyUserPasswordDaoImpl implements I_modifyUserPasswordDao{
//实现修改方法
	@Override
	public int modifyPassword(int id, String password) {
		 String  sql="update tb_login set password=?  where id=?";
		 return Contant.jdbcTemplate.update(sql,password,id);
	}
//	@Test
//	public void test() {
//		System.out.println(modifyPassword(2,"哈哈"));;
//	}

}
