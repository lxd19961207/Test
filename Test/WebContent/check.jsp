<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=utf-8>
	<title>教育培训机构</title>
	<style type="text/css">
	body{
		position: absolute;
		top:30%;
		left: 40%
	}
	#form1{
		position: absolute;
		top:10%;
		left: 15%;
	}
	#button{
  width:100px;
  position: absolute;
  left:5%;
	}
</style>
</head>
<body>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="#02f78e"> 账号验证
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<form id="form1" action="${pageContext.request.contextPath}/CHECK" method="post">
<table width="400" height="30">
<tr >
<td>
	<input type="text"  name="username" placeholder="账号" size="0" maxlength="20">
	</td>
	</tr>
	<tr class="center" >
	<td><font color="black">
<h5 >密保问题</h5>
</td>
</tr>
<tr>
<td>
<select name="question">
	<option value="11" selected="selected">妈妈叫什么名字？</option>
	<option value="22" >爸爸叫什么名字？</option>
	<option value="33" >小学班主任叫什么名字？</option>
	<option value="44" >你的家乡在哪儿？</option>
	<option value="55" >你的理想是什么？</option>
</select>
</td>
</tr>
<tr>
	<td>
	</td>
</tr>
<tr class="center">
<td><font color="black">输入答案
</td>
</tr>
<tr class="center">
<td>
<input type="text"  name="answer" placeholder="答案" size="20" maxlength="20">
</td>
</tr>
</table>
</br>
<input type="submit" id="button" value="提交">
</form>


</body>
</html>