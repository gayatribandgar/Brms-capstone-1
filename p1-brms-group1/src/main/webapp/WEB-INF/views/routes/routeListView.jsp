<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Route List</title>
</head>
<body>

	<jsp:include page="../_header.jsp"></jsp:include>
	<jsp:include page="../menus/_menuAdmin.jsp"></jsp:include>
<div style="margin:auto;
	            width:50%;
	            padding:10px;
	            background:#E5D1FA">
	<h3 style="text-align:center">Route Details</h3>

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
				<td>${route.destination}</td>
				<td><a href="editRoute?id=${route.routeId}">Edit</a></td>
				<td><a href="deleteRoute?id=${route.routeId}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>

	<p style="text-align:center">
		<a href="addRoute" >Add New Route</a>
	</p>
	</div>
	<jsp:include page="../_footer.jsp"></jsp:include>

</body>
</html>