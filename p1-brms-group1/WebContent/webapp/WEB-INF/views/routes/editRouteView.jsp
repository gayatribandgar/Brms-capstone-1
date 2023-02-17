<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit User</title>
</head>
<body>

	<jsp:include page="../_header.jsp"></jsp:include>
	<jsp:include page="../menus/_menuAdmin.jsp"></jsp:include>

	<h3>Edit User</h3>

	<p style="color: red;">${errorString}</p>

	<c:if test="${not empty editUser}">
		<form method="POST" action="doEditRoute">
			<input type="hidden" name="Source" value="${editRoute.source}" />
			<table border="0">
				<tr>
					<td>Source</td>
					<td style="color: red;">${editRoute.source}</td>
				</tr>
				<tr>
					<td>Destination</td>
					<td><input type="text" name="destination"
						value="${editRoute.destination}" /></td>
				</tr>
				
				<tr>
					<td><input type="submit" value="Submit" />
					<td><input type="reset" name="rest" value="Reset" /></td>
				</tr>
			</table>
		</form>
	</c:if>

	<jsp:include page="../_footer.jsp"></jsp:include>

</body>
</html>