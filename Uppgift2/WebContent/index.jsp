<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="<%= request.getContextPath() %>/vitamin" method="GET">
	
	Choose your favorite animal: <select name="animal">
	
    <option value="elephant">Elephant</option>
    <option value="car">Car</option>
    <option value="dog">Dog</option>
    <option value="cat">Cat</option>
  </select>
  
  <input type="submit" value="Go">

</form>

</body>
</html>