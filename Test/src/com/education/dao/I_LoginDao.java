package com.education.dao;

import java.util.List;
import com.education.entity.Login;
//定义接口，用于实现登录操作
public interface I_LoginDao {
	List<Login>  loginByUsAndPw(String username,String password);
}
