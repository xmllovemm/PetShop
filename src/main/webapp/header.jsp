<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
	<title>useless</title>
	
</head>

<body>
	<!-- web logo image -->
	<img align="middle" id="h" alt="网站作者" src="img/dog.jpg"><br>
	
	请<a href="html/login.html">登录</a>或<a href="">注册</a>
</body>
</html>