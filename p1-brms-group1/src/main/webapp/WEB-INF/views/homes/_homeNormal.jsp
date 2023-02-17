<%@page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HomePage</title>
</head>
<body>
	<jsp:include page="../_header.jsp"></jsp:include>
	<jsp:include page="../menus/_menuNormal.jsp"></jsp:include>
	<div style="background:#E5D1FA";style="text-align:center";>
	<h3 style="text-align:center">Welcome ${sessionScope.userIs.userLogin} </h3>
	<h4 style="text-align:center">Your Profile Details</h4>
	<br>
	<br>
	<table>
		<tr>
			<td>User Name</td>
			<td>- ${sessionScope.userIs.userLogin}</td>
		</tr>
		<tr>
			<td>Password</td>
			<td>- ${sessionScope.userIs.userPass}</td>
		</tr>
		<tr>
			<td>Role</td>
			<td>- ${sessionScope.userIs.role}</td>
		</tr>
	</table>
</div>
	<jsp:include page="../_footer.jsp"></jsp:include>
</body>
</html>
