<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h1>Spring-Code</h1>
<h2>${msg}</h2>
<form:form method="post" action="login">
	<button>Log In</button>
</form:form>
</body>
</html>
