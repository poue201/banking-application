<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>
	<h1> Login</h1> <br>
	
	<h2>Login to view your account</h2>
	
	<form action="/login" method="POST">
	
	Username : <input type="text" name="username" required="required"/> <br>
    Password : <input type="text" name="password" required="required"/> <br>

	<input type="submit" value="Register"/>
   
   </form>

</body>
</html>