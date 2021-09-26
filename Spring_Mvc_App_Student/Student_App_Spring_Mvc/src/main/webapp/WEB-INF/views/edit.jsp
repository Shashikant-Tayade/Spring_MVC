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

	<h3>Edit Page</h3>

	<form:form action="updatestudent">

	Roll Number : <form:input path="rollNumber" />
		<br>
		<br>
	Name        : <form:input path="name" />
		<br>
		<br>
	Address     : <form:input path="address" />
		<br>
		<br>
	Contact     : <form:input path="contact" />
		<br>
		<br>

		<input type="submit" value="updaterecord">


	</form:form>

</body>
</html>