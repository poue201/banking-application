<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>

<h1> New here? Why not open an account Today? </h1> <r>

<h2> Registration Form </h2>
 
   <form action="/register" method="POST">
   
    
    Customer Name : <input type="text" name="customerName" required="required"/> <br>
    Customer Email : <input type="text" name="customerEmail" required="required"/> <br>
    Contact Number : <input type="text" name="contactNumber" required="required"/> <br>
    Username : <input type="text" name="userName" required="required"/> <br>
    Password : <input type="text" name="password" required="required"/> <br>
    
    <input type="submit" value="Register"/>
   
   </form>

</body>
</html>