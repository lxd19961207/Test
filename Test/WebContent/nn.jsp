<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<form  action="${pageContext.request.contextPath}/CHECK"  method="post">
    <input type="text"   name="username">
   <input type="text"   name="question">
   <input type="text"   name="answer">
   <input type="submit"   value="4">
</form>
</body>
</html>