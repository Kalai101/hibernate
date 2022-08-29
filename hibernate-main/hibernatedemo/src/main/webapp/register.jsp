<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>
<form action="HibServlet" method = "post">
<table>
<tr>
<td><label>NAME</label></td>
<td><input type = "text" name = "empname"></td>
</tr>
<tr>
<td><label>MOBILE NUMBER</label></td>
<td><input type = "text" name = "empphno"></td>
</tr>
<tr>
<td><label>EMAIL ID</label></td>
<td><input type = "text" name = "empemail"></td>
</tr>
<tr>
<td colspan = "1"><input type = "submit" value = "submit"></td>
</tr>
</table>

</form>
</body>
</html>