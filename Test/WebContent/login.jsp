<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=utf-8>
	<title>教育培训机构</title>
	<style type="text/css">
	body {
		content-width:400;
		content-height:450;
	} 
   a{
   text-decoration:none;
   }
   .l1{
   	background-color: #02f78e;
   	border: none;
   	color:white;
   }
   .l2{
   	background-color: #46a3ff;
   	border:none;
   	color: white;
   }
  .d1{
	position: absolute;
	top:20%;
	left: 30%;
			}
	</style>
	<script type="text/javascript">
   function jump(){
   	window.open('注册.html');
   
   }
	</script>
</head>
<body>
<div class="d1">
<form action=""  method="post">
<input name="image" type="image" src="" width="400" height="100">
</form>
<form name="form1" action="${pageContext.request.contextPath}/loginingServlet" method="post">
<table width="400" height="50">
<tr align="center">
 <td>
 	<input type="text"  name="username"  value=""  placeholder="账号" size="20" maxlength="20">
 </td>
</tr>
</table>
</br>
<table width="400" height="50">
<tr align="center">
 <td>
 	<input  type="password" name="password" placeholder="密码" value="" size="20" maxlength="50">
 </td>
</tr>
</table>
</br>
<table width="400" height="10">
<tr align="right">
<td>
<select name="type" style="width:80px; height:20px" >
	<option  value="校长" selected="selected"> 校长 </option>
	<option  value="老师">老师 </option>
	<option  value="学生">学生 </option>
	</select>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="${pageContext.request.contextPath}/check.jsp"><font color="#02f78e">忘记密码</a>
	</td>
	</tr>
</table>
</br>
<table width="400" height="50">
<tr align="center">
<td class="l1">
		<input type="submit" value="登录" class="l1" >
	</td>
</tr>
</table>	
</form>
</br>
<form action="">
<table width="400" height="50">
<tr align="center">
<td class="l2">
		<input type="submit" value="注册" class="l2" onclick="return jump()">
	</td>
</tr>
</table>	
</form>
</div>
</body>
</html>