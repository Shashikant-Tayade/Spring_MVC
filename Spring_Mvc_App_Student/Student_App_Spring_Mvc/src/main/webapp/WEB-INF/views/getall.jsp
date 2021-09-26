<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>Get All Page</h3>


	<h1>Students List</h1>
	<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>Roll Number</th>
			<th>Name</th>
			<th>Address</th>
			<th>Contact</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="student" items="${listOfStudents}">
			<tr>
				<td>${student.rollNumber}</td>
				<td>${student.name}</td>
				<td>${student.address}</td>
				<td>${student.contact}</td>
				<td><a href="edit?rollNumber=${student.rollNumber}">Edit</a></td>
				<td><a href="delete?rollNumber=${student.rollNumber}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<hr>
	<a href="addnew"> Add New </a>
</body>
</html>