package com.education.dao;

import java.util.List;

public interface I_FindUserDao {
//通过id寻找对应的表对象
	List findUserById(int id);
}
