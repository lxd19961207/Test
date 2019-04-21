<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/MODIFY"  method="post">
  <input  type="password"  name="password1">
  <input  type="password"  name="password2">
  <input   type="submit"  value="提交"></form>
</body>
</html>