package com.education.service.impl;

import java.util.List;

import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import com.education.contant.Contant;
import com.education.dao.impl.I_loginDaoImpl;
import com.education.entity.Login;
import com.education.service.I_loginSerivice;

public class I_loginSeriviceImpl implements  I_loginSerivice{
//接收参数，返回用户
	@Override
	public Login loginByUsAndPw(String username, String password,String type) {
		List<Login>  login_lsit=new I_loginDaoImpl().loginByUsAndPw(username,password);
		for(Login login:login_lsit) {
			if(type.equals(login.getType())) {
				return login;
			}
		}
		return  null;
	}

}