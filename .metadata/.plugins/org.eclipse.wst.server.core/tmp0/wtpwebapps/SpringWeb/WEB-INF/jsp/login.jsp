<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
	
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link href='<spring:url value="/resources/css/style.css"/>'
	rel="stylesheet" />
<link href='<spring:url value="/resources/css/bootstrap.min.css"/>'
	rel="stylesheet" />

</head>
<body>
<div style="margin: 150px auto;">
	<f:form action="login-panel" modelAttribute="obj">
		<h1 align="center">Login Here...</h1>
		<div id="box">
			UserName: <f:input path="username" class="form-control"/><br>
			Password:<f:input type="password" path="password" class="form-control"/><br>
			<input type="submit" value="Login" name="action" class="btn btn-info Login"/>
			<input type="submit" value="Register" name="action" class="btn btn-info Login"/>
		</div>
	</f:form>
	<f:form action="register">
		
	</f:form>
	<h2>${objreg.msg}</h2>
	</div>
</body>
</html>