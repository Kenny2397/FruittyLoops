<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fruits</title>
</head>
<body>
	<h1>FRuits</h1>
	<table>
		
	</table>
	<c:forEach var="fruit" items="${fruits}">
		<c:out value="${fruit.getName()}"/><c:out value="${fruit.getPrice()}"/>
		
	</c:forEach>
</body>
</html>