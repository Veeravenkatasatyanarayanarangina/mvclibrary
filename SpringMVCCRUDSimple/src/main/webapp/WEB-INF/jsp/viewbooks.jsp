<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="wheat">
<br><br>
<center>
<h1>Welcome To Book Application</h1>
<br><br>
<h2><a href="#">Profile</a> || <a href="addbook">Add Book</a> || <a href = "viewbooks"> View Book</a> || <a href="logout">Log out</a> </h2>
<br><br>
<table border="2" width="70%" cellpadding="2">
<tr><th>Book Id</th><th>Book Name</th><th>Book Price</th><th>Book Auther</th><th>Publisher</th><th>Year</th><th>Update</th><th>Delete</th></tr>

<c:forEach var="book" items="${list}">
<tr>
<td>${book.bkid}</td>
<td>${book.book_name}</td>
<td>${book.book_price}</td>
<td>${book.book_auther}</td>
<td>${book.publisher}</td>
<td>${book.year}</td>
 <td><a href="updatebook/${book.bkid}">Edit</a></td>
    <td><a href="deletebook/${book.bkid}">Delete</a></td>
</tr>

</c:forEach>
</table>
</center>

</body>
</html>