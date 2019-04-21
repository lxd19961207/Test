package com.education.service;

import java.util.List;

//实现验证时账号查询用户类型
public interface I_FindUserTypeByUsernameService {
    List<Object>	FindUserTypeByUsername(String username );
}
