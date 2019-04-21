package com.education.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.education.dao.impl.I_modifyByPwServiceImpl;
import com.education.entity.Admintor;
import com.education.entity.Student;
import com.education.entity.Teacher;
@WebServlet("/MODIFY")
public class MODIFYServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码集
		request.setCharacterEncoding("utf-8");
		//获取请求中的参数并判断其中的用户类型
	int login_id=(int) request.getSession().getAttribute("id");
//		System.out.println(login_id);
//		System.out.println(request.getSession().getAttribute("id"));
		String newPassword=request.getParameter("password1");
		System.out.println(newPassword);
		String newPassword2=request.getParameter("password2");
		System.out.println(newPassword2);
		//判断是否为空
		 if("".equals(newPassword)||"".equals(newPassword2)){
			 System.out.println("1");
			 response.sendRedirect("/");
		 }
		 //不为空
		 else {
		//判断是否输入一致
		  //不一致
		  if(newPassword.equals(newPassword2)) {
			  new I_modifyByPwServiceImpl().modify(login_id,newPassword);
			   System.out.println("ssssss");
			   response.sendRedirect("/");
		  }
		  //一致
		  else {
			  System.out.println(2);
			  response.sendRedirect(""); 
		  }
		 }
		  
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
