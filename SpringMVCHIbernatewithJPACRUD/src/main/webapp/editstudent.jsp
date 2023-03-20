<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>Enter student data</h1>
		<form:form action="updatestudent" modelAttribute="student">
			<table>
				<tr>
					<td>ID</td>
					<td><form:input path="id" readonly="true"/></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><form:input path="email" /></td>
				</tr>
				<tr>
					<td>Phone</td>
					<td><form:input path="phone" /></td>
				</tr>
				<tr>
					<td>Age</td>
					<td><form:input path="age" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Submit"></td>
				</tr>
			</table>



		</form:form>
		<h2><a href="home.jsp">Back to Home</a></h2>
	</div>
</body>
</html>