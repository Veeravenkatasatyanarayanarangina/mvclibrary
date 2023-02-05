<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="wheat">
<br><br><br>
<center>

<h1>Welcome to Book Store App</h1>
<br><br>
<h3>User Registration</h3>

<form action="saveRegister" method="post">
<input type="text" name = "username" placeholder="enter username">
<input type="text" name = "password" placeholder="enter password">
<input type="email" name = "email" placeholder="enter email">
<input type="number" name = "phone" placeholder="enter phone number">
<input type="submit" value="register">
</form>

</center>
<br><br>
<button><a href="/SpringMVCCRUDSimple/">Back to Home</a></button>
</body>
</html>
