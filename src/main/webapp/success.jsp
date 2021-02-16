<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logged in!</title>
</head>
<body>

<h2>Success!</h2>
<p>You have successfully logged in!</p>
 
<c:url var="back_home" value="backtoindex" />
<a href="index.jsp"> Logout and Return to Home</a>
  
</body>
</html>