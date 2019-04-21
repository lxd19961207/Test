package com.education.service;

import java.util.List;

import com.education.entity.Login;

//定义接口，用于实现登录
public interface I_loginSerivice {
   Login  loginByUsAndPw(String username,String password,String type);
}
