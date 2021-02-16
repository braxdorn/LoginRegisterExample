<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Account</title>
</head>
<body>

<form method="POST" action="checkuser">
 
  <table>
    <tr> <td> Username:</td><td><input type="text" name="uname"> </td>   </tr>
    <tr> <td> Password:</td><td><input type="text" name="pword"> </td>   </tr>
  </table>
 
  <input type="submit" value="Log In">
</form>
 
<c:url var="back_home" value="backtoindex" />
<a href="index.jsp"> Return to Home Page</a>
  
</body>
</html>