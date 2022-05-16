<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>В поле не должно быть более двух знаков после точки</p>
<form action="${pageContext.request.contextPath}/FormServlet" method="post">
<input type="submit" name="Ok" value="Return">
</form>
</body>
</html>