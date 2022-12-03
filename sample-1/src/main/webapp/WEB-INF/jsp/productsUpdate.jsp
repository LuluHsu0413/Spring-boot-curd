<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
<form:form id="form1">
   <table>
    <tr>
        <td><form:label path="productID">ProductID：</form:label></td>
        <td><form:input path="productID" /></td>
    </tr>
    <tr>
        <td><form:label path="productName">ProductName：</form:label></td>
        <td><form:input path="productName" /></td>
    </tr>
    <tr>
        <td colspan="2">            
        </td>
    </tr>
</table>  
</form:form>
<button id="button1">update</button>
<script>
function ds()
{
alert("更新成功");
window.location.replace(document.referrer);
}
function send(e)
{
	e.preventDefault();		
	var id=$("#productID").val();
	var name=$("#productName").val();
	$.post("test",{"productID":id,"productName":name},ds);
}
function show()
{
$("#button1").click(send);
}
$(document).ready(show);
</script>
</body>
</html>