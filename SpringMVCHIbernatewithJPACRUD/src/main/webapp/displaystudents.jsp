<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>Student details</h1>
		<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Phone</th>
			<th>Age</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${students}" var="student">
			<tr>
				<td>${student.id }</td>
				<td>${student.name }</td>
				<td>${student.email }</td>
				<td>${student.phone }</td>
				<td>${student.age }</td>
				<td><a href="edit?id=${student.id}">Edit</a></td>
				<td><a href="delete?id=${student.id}">Delete</a></td>
			</tr>
		
		</c:forEach>
		
		
	</table>
	<h2><a href="home.jsp">Back to Home</a></h2>
	</div>
</body>
</html>