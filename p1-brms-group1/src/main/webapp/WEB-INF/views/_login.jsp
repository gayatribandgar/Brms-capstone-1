<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>

<body>
	<jsp:include page="_header.jsp"></jsp:include>
	<jsp:include page="menus/_menuDefault.jsp"></jsp:include>
<div style="margin:auto;
	            width:50%;
	            padding:10px;
	            background:#E5D1FA
	            ">
	<h3 style="text-align:center">Login Page</h3>
	<p style="color: red;">${errorString}</p>
	<p style="color: blue;">${logOutString}</p>
	<form method="POST" action="validate">
	
	
		<table border="1" cellpadding="5" cellspacing="1">
			<tr>
				<td>User Name</td>
				<td><input type="text" name="userName" value="${user.userLogin}" />
				</td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="text" name="password" value="${user.userPass}" />
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /> 
				<td><input type="reset" name="rest" value="Reset" /></td>
			</tr>
		</table>
		
	</form>
	</div>
	<jsp:include page="_footer.jsp"></jsp:include>

</body>
</html>