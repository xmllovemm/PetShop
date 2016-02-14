<%@ page language="java" contentType="text/html; charset=utf-8"  pageEncoding="utf-8"%>
<html>
<head>	
	<title>Welcome to lemon's home</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include><br><br>
	
	这里是主页
	
	<form action="login" method="post">
		<p>用户名:<input type="text" name="name"></p>
		<p>密&nbsp;&nbsp;码:<input type="text" name="pwd"></p>
		<p><input type="submit" value ="name"></p>
		
	</form>
	
	<br><br>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>