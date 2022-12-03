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
				<br />
				<table id="table1" class="table-hover">
					<thead>
						<tr class="table-info">
							<th>Product_ID</th>
							<th>Product_Name</th>
							<th>Action</th>
							<th>Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="row" items="${dataList}">
							<tr>
								<td>${row.productID}</td>
								<td>${row.productName}</td>
								<td><input type="button" id=${row.productID} value="修改" onclick="location.href='http://localhost:8080/update/'+id"></td>
								<td><input type="button" id=${row.productID} value="刪除" onclick="location.href='http://localhost:8080/delete/'+id"></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
</body>
</html>