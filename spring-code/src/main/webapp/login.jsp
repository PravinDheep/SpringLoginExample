<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring-Code</title>
</head>
<body>
<form:form id="loginForm" action="result" method="post" modelAttribute="loginCheck" >
	<table>
	<tr>
	<td><form:label path="userName">UserName:</form:label></td>
	<td><form:input path="userName"/></td>
	</tr>
	<tr>
	<td><form:label path="password">Password:</form:label></td>
	<td><form:password path="password"/></td>
	</tr>
	<tr><td><input type="submit"/></td></tr>
	</table>
</form:form>

</body>
</html>