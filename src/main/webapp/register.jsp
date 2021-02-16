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

<form method="POST" action="adduser">
 
  <table>
    <tr> <td> First Name:</td><td><input type="text" name="fname"> </td>   </tr>
    <tr> <td> Last Name:</td><td><input type="text" name="lname"> </td>   </tr>
    <tr> <td> Username:</td><td><input type="text" name="uname"> </td>   </tr>
    <tr> <td> Password:</td><td><input type="text" name="pword"> </td>   </tr>
  </table>
 
  <input type="submit" value="Add User">
</form>
 
<c:url var="back_home" value="backtoindex" />
<a href="${back_home}"> Return to Home Page</a>
  
</body>
</html>