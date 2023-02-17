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
	<jsp:include page="../menus/_menuAdmin.jsp"></jsp:include>
	<div style="background:#E5D1FA";style="text-align:center";>
	<h3 style="margin-left:30%"Hello>Hello</h3>
	<h4 style="margin-left:30%">This is  online Bus Reservation Application for admin Use</h4>
	
	<h4 style="margin-left:30%">  It includes the following functions: </h4>
	<br>
<div style="margin-left:30%">
	
	<div >Login</div> 
	<div >Log Out</div> 
	<div >Authentication</div> 
	<div >Edit Route</div>
	<div >Delete Route </div>
	<div>Add Route Details</div>
	<div>Display all Route Details</div>
	
	</div>
	<jsp:include page="../_footer.jsp"></jsp:include>
</body>
</html>
