<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User List</title>
</head>
<body>

	<jsp:include page="../_header.jsp"></jsp:include>
	<jsp:include page="../menus/_menuAdmin.jsp"></jsp:include>

	<h3>User Details</h3>

	<p style="color: red;">${errorString}</p>

	<table border="1" cellpadding="5" cellspacing="1">
		<tr>
			<th>RouteId</th>
			<th>Source</th>
			<th>Destination</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${routeList}" var="route">
			<tr>
				<td>${route.routeId}</td>
				<td>${route.source}</td>
				<td>${user.destination}</td>
				<td><a href="editRoute?id=${route.routeId}">Edit</a></td>
				<td><a href="deleteRoute?id=${route.routeId}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>

	<p>
		<a href="addRoute">Add New Route</a>
	</p>
	<jsp:include page="../_footer.jsp"></jsp:include>

</body>
</html>