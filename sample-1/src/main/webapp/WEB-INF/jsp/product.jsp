<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h2>Product Information</h2>
		<div>
			<table>
					<tr>
						<td>ProductID</td>
						<td><input type="text" id="productID" size="60" /></td>
					</tr>
					<tr>
						<td>ProductName</td>
						<td><input type="text" id="productName" size="60" /></td>
					</tr>
					<tr>
						<td colspan="2"><input type="button" id="create" value="新增" /></td>
					</tr>
				</table>
				<br />
				<div id="ds">
				<jsp:include page="index.jsp"></jsp:include>
				</div>
			</div>
			<div id="ds"></div>
			<script>   
   function demo(data)
   {
	   $("#ds").html("");
	   $("#ds").html(data);
   }
   function send(evt)
   {
		evt.preventDefault();
		   var id=parseInt($("#productID").val());
		   var name=$("#productName").val();
		   $.post("product/update",{"productID":id,"productName":name},demo)
   }
	function show()
	{
		$(create).click(send);
	} 
	$(document).ready(show);
   </script>
</body>
</html>