package com.education.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.education.entity.Admintor;
import com.education.entity.Student;
import com.education.entity.Teacher;
import com.education.service.I_FindUserTypeByUnServiceImpl;

/**
 * Servlet implementation class CHECKservlet
 */
@WebServlet("/CHECK")
public class CHECKservlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		      //对请求参数进行编码
		    request.setCharacterEncoding("utf-8");
		      //获取请求参数
		    String username=request.getParameter("username");
		    String question=request.getParameter("question");
		    String answer=request.getParameter("answer");
		    System.out.println(question+"aa");
		    System.out.println(answer+"bbb");
		    if(answer!=null) {
		    //定义变量，用于获取用户正确的账号和密码
		    String currentQuestion=null;
		    String currentAnswer=null;
		      //获取对象
		    List list=new I_FindUserTypeByUnServiceImpl().FindUserTypeByUsername(username);
		    System.out.println(list.get(0));
		      //验证用户名是否存在
		        //不存在
		    if(list==null&&list.size()==0) {
		          //页面跳转
		    	System.out.println(list+"出错啦1");
		        response.sendRedirect(request.getContextPath()+"/checkFailed.html");	
		    }
		        //存在
		    else {
		    	//获取对象类型和正确的密码和账号
		    	if(list.get(0) instanceof Admintor) {
		    		Admintor admintor=(Admintor) list.get(0);
		    		request.getSession().setAttribute("id",admintor.getLogin_id());
		    		currentQuestion=admintor.getQuestion();
		    		currentAnswer=admintor.getAnswer();
		    		System.out.println(currentAnswer);
		    		System.out.println(currentQuestion);
		    	}
		    	else if(list.get(0) instanceof Teacher) {
		    		Teacher teacher=(Teacher) list.get(0);
		    		request.getSession().setAttribute("id",teacher.getLogin_id());
		    		currentQuestion=teacher.getQuestion();
		    		currentAnswer=teacher.getAnswer();
		    		System.out.println(currentAnswer);
		    		System.out.println(currentQuestion);
		    	}
		    	else if(list.get(0) instanceof Student) {
		    		Student student=(Student) list.get(0);
		    		request.getSession().setAttribute("id", student.getLogin_id());
		    		currentQuestion=student.getQuestion();
		    		currentAnswer=student.getAnswer();
		    		System.out.println(currentAnswer);
		    		System.out.println(currentQuestion);
		    	}
		    	else {
		    		System.out.println("出错啦2");
		    		response.sendRedirect(request.getContextPath()+"/checkFailed.html");
		    	}
		    	//判断currentQuestion，currentAnswer是否为空
		    	if(currentQuestion==null||currentAnswer==null) {
		    		System.out.println("出错啦3");
		    		response.sendRedirect(request.getContextPath()+"/checkFailed.html");
		    	}else {
		          //判断问题和回答是否正确
		    		//正确
		    		if(currentQuestion.equals(question)&&currentAnswer.equals(answer)) {
		    			 //请求转发，进行密码修改
		    			System.out.println("开始修改");
		    			request.getRequestDispatcher("/modify.jsp").forward(request, response);
		    		}
		            //不正确
		    		else {
		              //页面跳转
		    			System.out.println("出错啦4");
		               response.sendRedirect(request.getContextPath()+"/checkFailed.html");
		    		}
		    }
		    }
	}
		    else {
		    	System.out.println("密码空啦");
		    	response.sendRedirect(request.getContextPath()+"/checkFailed.html");
		    }
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  doGet(request, response);
	}

}
