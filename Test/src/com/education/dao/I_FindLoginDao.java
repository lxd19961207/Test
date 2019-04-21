package com.education.dao;
//忘记密码的数据验证

import java.util.List;

import com.education.entity.Login;
import com.education.entity.Student;

public interface I_FindLoginDao {
//查找login表username对应的id
	int  findIdByUsername(String username);
//查找login表username对应的type
	String findTypeByUsername(String username);
}
