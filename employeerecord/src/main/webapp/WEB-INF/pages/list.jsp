<%@page import="com.chetank.model.Employee"%>
<%@page import="com.chetank.model.Address"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	List<Address> al = (List<Address>) request.getAttribute("elist");
%>
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
	<h2>${message}</h2>
		<table class="table " style="margin: 10px">
			<tr>
				<th>Name</th>
				<th>Age</th>
				<th>Address</th>
				<th>Contact No</th>
			</tr>
			<%
				for (Address a : al) {
					//Address a1 = (Address)a;
					Employee e = a.getEmployee();
			%>
			<tr>
				<td><%=e.getFirstName()%> <%=e.getLastName()%></td>
				<td><%=e.getAge()%></td>
				<td><%=a.getPresentAdd()%></td>
				<td><%=a.getContactNo()%></td>
				<td><a href="/employeerecord/edit/<%=e.getId()%>" class="btn btn-success"> Edit</a></td>
				<td><a href="/employeerecord/delete/<%=e.getId()%>" class="btn btn-danger">Delete</a></td>
			<tr>
				<%
					}
				%>
			
		</table>
	</div>
</body>
</html>