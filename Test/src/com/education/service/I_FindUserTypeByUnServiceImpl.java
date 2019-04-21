package com.education.service;

import java.util.List;

import org.junit.Test;

import com.education.dao.impl.I_FindAdmintorDaoImpl;
import com.education.dao.impl.I_FindLoginDaoImpl;
import com.education.dao.impl.I_FindStudentDaoImpl;
import com.education.dao.impl.I_FindTeachertDaoImpl;

//根据账号查询不同的用户类型
public class I_FindUserTypeByUnServiceImpl implements I_FindUserTypeByUsernameService {

	@Override
	public List FindUserTypeByUsername(String username) {
		//查询出login表中账号对应的login_id和type
		int login_id=0;
		String type=null;
		//try catch为了防止用户账号不存在时处理异常
		try {
			
		 login_id=new I_FindLoginDaoImpl().findIdByUsername(username);
		 type=new I_FindLoginDaoImpl().findTypeByUsername(username);
			System.out.println(type);
		}catch(Exception e) {
			return  null;
		}
		
		//查询用户并返回用户
		switch(type) {
		case "校长":return new I_FindAdmintorDaoImpl().findUserById(login_id);
		case"老师": return new I_FindTeachertDaoImpl().findUserById(login_id);
		case"学生": return new I_FindStudentDaoImpl().findUserById(login_id); 
		default: return null;
		}
		
	}
//	@Test
//	public void  test() {
//		System.out.println(FindUserTypeByUsername("1"));
//		System.out.println(FindUserTypeByUsername("2"));
//		System.out.println(FindUserTypeByUsername("3"));
//		System.out.println(FindUserTypeByUsername("4"));
//	}

}
