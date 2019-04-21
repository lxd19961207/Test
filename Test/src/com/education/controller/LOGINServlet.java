package com.education.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.education.entity.Login;
import com.education.service.impl.I_loginSeriviceImpl;
@WebServlet("/loginingServlet")
public class LOGINServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 //制定编码集
        request.setCharacterEncoding("utf-8");
        //获取参数
        String  username=(String) request.getParameter("username");
        //System.out.println(username);
        String  password=(String) request.getParameter("password");
        //System.out.println(password);
        String  type=(String)request.getParameter("type");
        //System.out.println(type);
        //获取对象
        Login login=new I_loginSeriviceImpl().loginByUsAndPw(username, password,type);
         //判断用户是否存在
             //不存在
          if(login==null) {
        	  //System.out.println("null");
        	  response.sendRedirect("/");
          } 
            //存在
          else {
        	  //判断类型，页面跳转
      	  switch(login.getType()){
        	case "学生": 
        		System.out.println("1成功啦"); 
         	response.sendRedirect("/");break;
          	case "老师": 
          		System.out.println("2成功啦");
         	response.sendRedirect("/");break;
          	case "校长": 
          		System.out.println("3成功啦");
            response.sendRedirect("/");break;
        	}   	  
          }
        
        
        
        
        
        
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
