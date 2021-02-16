<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<html>
<head>
<title>User Management</title>
</head>
<body>

  <h2>Welcome!</h2>
  
  <div>
    <c:url value="register" var="register" />
    <h2><a href="register.jsp">Register</a></h2>
    
    <br />

    <c:url value="login" var="login" />
    <h2><a href="login.jsp">Login</a></h2>
  </div>

</body>
</html>