<!--<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation</title>
</head>
<body>

The student is confirmed: ${student.firstName} ${student.lastName}

<br><br>

Country: ${student.country}

<br><br>

Language: ${student.favoriteLanguage}

<br><br>

Operating Systems:
<c:forEach var="temp" items="${student.operatingSystems}">

<ul><li>${temp}</li></ul>
</c:forEach>



</body>
</html>