<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3> EDIT PERSON </h3>
<form:form action="updateperson">
	
	Id : <form:input path="id"/> <br> <br>
	First Name : <form:input path="firstName"/> <br> <br>
	Last Name  : <form:input path="lastName"/>  <br> <br>
	Laptop Id  : <form:input path="laptop_id"/> <br> <br>
	<input type="submit" value="Update Record">
	</form:form>
	

</body>
</html>