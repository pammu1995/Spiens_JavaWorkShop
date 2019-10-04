<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<div class="jumbotron">
		<form:form id="myForm" method="post" action="savepro"
			modelAttribute="project">
			<table>
				<tr>
					<td>Project Title :</td>
					<td><form:input type="text" path="projectName" /></td>
				</tr>
				<tr>
					<td>Duration</td>
					<td><form:input type="text" path="duration" /></td>
				</tr>
				<tr>
					<td>Status</td>
					<td><form:input type="text" path="status" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" name="action1" value="Add another Project"
						class="btn btn-primary" /></td>
							<td colspan="2"><input type="submit" name="action2" value="Save Project"
						class="btn btn-primary" /></td>
				</tr>
			</table>
		</form:form>
		<script>
			function submit() {
				/*Put all the data posting code here*/
				document.getElementById("myForm").reset();
			}
		</script>
	</div>
</body>
</html>