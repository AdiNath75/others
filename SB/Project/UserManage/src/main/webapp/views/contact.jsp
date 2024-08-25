<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View All Users</title>
</head>
<body>

	<table>
		<thead>
			<tr>
				<th>User Name</th>
				<th>User Email</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${contact}" var="cot">
				<tr>
					<td>${cot.username }</td>
					<td>${cot.useremail }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>