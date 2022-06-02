<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account page</title>
</head>
<body>
	
	<h1> Create an Account to get started </h1> 
	
	 <form action="/account" method="POST">
   
    
    First Name: <input type="text" name="firstName" required="required"/> <br>
    Last Name : <input type="text" name="lastName" required="required"/> <br>
  
    
    <input type="submit" value="Create account"/>
   
   </form>

</body>
</html>