<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Route</title>
</head>
<body>
	<jsp:include page="../_header.jsp"></jsp:include>
	<jsp:include page="../menus/_menuAdmin.jsp"></jsp:include>
<div style="margin:auto;
	            width:50%;
	            padding:10px;
	            background:#E5D1FA">
<h3 style="text-align:center">Add Route</h3>
	<p style="color: red;">${errorString}</p>

	<form method="POST" action="doAddRoute">
		<table border="1" cellpadding="5" cellspacing="1">
		<tr>
				<td>RouteId</td>
				<td><input type="text" name="routeId" value="${newRoute.routeId}" /></td>
			</tr>
			<tr>
				<td>Source</td>
				<td><input type="text" name="source" value="${newRoute.source}" /></td>
			</tr>
			<tr>
				<td>Destination</td>
				<td><input type="text" name="destination" value="${newRoute.destination}" /></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Submit" />
				<td><input type="reset" name="rest" value="Reset" /></td>

			</tr>
		</table>
	</form>
</div>
	
	<jsp:include page="../_footer.jsp"></jsp:include>

</body>
</html>