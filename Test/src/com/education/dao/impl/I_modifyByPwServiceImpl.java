package com.education.dao.impl;

import java.util.List;

import com.education.service.I_FindUserTypeByUsernameService;
import com.education.service.I_modifyUserByPwService;

public class I_modifyByPwServiceImpl  implements I_modifyUserByPwService{
	//实现修改业务
	@Override
	public void  modify(int id, String password) {
		int  flag=new I_modifyUserPasswordDaoImpl().modifyPassword(id, password);
	}



}
