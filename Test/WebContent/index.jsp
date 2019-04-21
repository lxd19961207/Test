<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/17
  Time: 18:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>项目架构测试</title>
  </head>
  <body>
   <form  action="${pageContext.request.contextPath}/loginingServlet"  method="post">
   <input type="text"  name="username" >
   <input  type="text" name="password">
   <input  type="text"  name="type">
   <input type="submit"  value="提交">  
   </form>
  </body>
</html>
