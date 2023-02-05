<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>book registration</title>
</head>
<body bgcolor="wheat">
<center>
<h1>WelCome To Book Application</h1>
<br><br>
<h3>Add Book</h3>
<h2><a href="#">Profile</a> || <a href = "viewbooks"> View Book</a> || <a href="/">Log out</a> </h2>
<br><br>
<form action="bookRegister" method="post">
<input type="text" name = "book_name" placeholder="book name">
<input type="number" name = "book_price" placeholder="book price">
<input type="text" name = "book_auther" placeholder="book_author">
<input type="text" name = "publisher" placeholder="publisher">
<input type="text" name = "year" placeholder="year">
<input type="submit" value="AddBook">

</form>

</center>

</body>
</html>
