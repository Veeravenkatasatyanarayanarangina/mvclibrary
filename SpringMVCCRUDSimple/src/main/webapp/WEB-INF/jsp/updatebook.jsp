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
<body>

<br><br>
<center>
<h1>Welcome To Book Application</h1>
<br><br>
<h2><a href="#">Profile</a> || <a href="addbook">Add Book</a> || <a href ="viewbooks"> View Book</a> || <a href="logout">Log out</a> </h2>
<br><br>
<form:form action="updatebook" method="post">
<form:hidden path="bkid"/>
<form:input path = "book_name" />
<form:input  path = "book_price" />
<form:input  path = "book_auther" />
<form:input  path = "publisher" />
<form:input  path = "year" />
<input type="submit" value="EditBook">

</form:form>


</body>
</html>