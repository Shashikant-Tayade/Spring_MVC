<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>WELCOME TO PERSON APP</h3>
	

	<a href="add-new-person"> Add New Person </a> <br> <br> 

	<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Laptop Id</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="person" items="${listOfPerson}">
			<tr>
				<td>${person.id}</td>
				<td>${person.firstName}</td>
				<td>${person.lastName}</td>
				<td>${person.laptop_id}</td>
				<td><a href="editperson?id=${person.id}">Edit</a></td>
				<td><a href="delete?id=${person.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>



</body>
</html>