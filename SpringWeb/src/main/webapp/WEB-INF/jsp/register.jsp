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
	<div class="row">
		<div class="col-sm-4"></div>
		<div class="col-sm-4">
			<f:form action="processRegistration" modelAttribute="objreg">
				<h1 align="center">User Registration...</h1>
				<div class="form-group">
					<f:label path="name">Name</f:label>
					<f:input path="name" class="form-control" />
				</div>

				<div class="form-group">
					<f:label path="userName">UserName</f:label>
					<f:input path="userName" class="form-control" />
				</div>

				<div class="form-group">
					<f:label path="password">Password</f:label>
					<f:password path="password" class="form-control" />
				</div>

				<div class="form-group">
					<f:label path="country">Country</f:label>
					<f:select path="country" class="form-control">
						<f:option value="None" label="--Select--" />
						<f:options items="${countryList }" />
						<%-- <f:option value="IND" label="India"></f:option>
				<f:option value="PAK" label="pakistan"></f:option>
				<f:option value="CHN" label="China"></f:option>
				<f:option value="NPL" label="Nepal"></f:option>
				<f:option value="BAN" label="Bangladesh"></f:option>
				<f:option value="SRL" label="SriLanka"></f:option>  --%>
					</f:select>
				</div>
				<br>
				<div class="form-group">
					<f:label path="gender">Gender</f:label>
					<f:radiobutton path="gender" value="M" label="Male" />
					<f:radiobutton path="gender" value="F" label="Female" />
				</div>
				<br>
				<div class="form-group">
					<input type="submit" value="Register Mow"
						class="form-control btn btn-info">

				</div>

			</f:form>
			<h2>${objreg.msg}</h2>
		</div>
		<div class="col-sm-4"></div>
	</div>
</body>
</html>