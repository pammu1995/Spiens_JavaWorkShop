<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="jumbotron" style="margin:0px 350px">
		<form:form method="post" action="update" modelAttribute="editemployee">
			<table>
				<tr>
					<td>First Name :</td>
					<td><form:input type="text" path="firstName" /></td>
					<td><form:input type="hidden" path="id" /></td>
				</tr>
				<tr>
					<td>Last Name :</td>
					<td><form:input type="text" path="lastName" /></td>
				</tr>
				<tr>
					<td>Age :</td>
					<td><form:input type="text" path="age" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="update" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>