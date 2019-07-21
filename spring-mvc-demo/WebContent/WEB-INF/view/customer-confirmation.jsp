<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer confirmation</title>
</head>
<body>
	Customer is confirmed: ${customer.firstName} ${customer.lastName}
	<br><br>
	
	Free passes is confirmed:  ${customer.freePasses}
	
	<br><br>
	
	Postal Code is confirmed: ${customer.postalCode}
	
		<br><br>
	
	Course code is confirmed: ${customer.courseCode}
	
</body>
</html>