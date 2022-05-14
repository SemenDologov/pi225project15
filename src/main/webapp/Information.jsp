<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>Номера зачетных книжек: <br>Долгов Семен - 20130847<br>Бикбулатов Данил - 20130717<br>Трофимов Данил - 20130841<br>Харисов Рафаэль - 20210066</p>
<form action="${pageContext.request.contextPath}/FormServlet" method="post">
<input type="submit" name="Ok" value="Return">
</form>
</body>

</html>