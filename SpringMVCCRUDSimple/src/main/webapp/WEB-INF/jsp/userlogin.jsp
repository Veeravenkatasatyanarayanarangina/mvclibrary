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
<h3>User Login</h3>


<form action="userlogin" method="post">
<input type="text" name = "email" placeholder="enter username">
<input type="text" name = "password" placeholder="enter password">

<input type="submit" value="login">
</form>
<h3><a href = "registerform"> sign up</a></h3>

</center>
<br><br>
<button><a href="/SpringMVCCRUDSimple/">Back to Home</a></button>
</body>
</html>