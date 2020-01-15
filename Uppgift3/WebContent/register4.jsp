<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	table style="with: 50%">
	
	
	<% String username = request.getParameter("username"); %>
<a>Welcome   <% out.println(username); %> User!!! You have logged in.</a>

<a href="register3.jsp"><b>Logout</b></a>


</body>
</html>