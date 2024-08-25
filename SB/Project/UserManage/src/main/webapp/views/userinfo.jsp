<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Manage App</title>
</head>
<body>

	<marquee>
		<h1>User Registration</h1>
	</marquee>
	<font color="green">${SUCCESS}</font>
	<font color="Red">${FAIL}</font>
	<form:form action="saveUsers" modelAttribute="user" method="POST">
		<table align="center">
			<tr>
				<td>UserName</td>
				<td><form:input path="username" /></td>
			</tr>
			<tr>
				<td>UserEmail</td>
				<td><form:input path="useremail" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="save" /></td>
			</tr>
		</table>
		<div align="center">
			<a href="viewAllUsers">View All Users</a>
		</div>
	</form:form>

</body>
</html>