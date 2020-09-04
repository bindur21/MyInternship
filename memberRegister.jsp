<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>

	<form action="Register" method="post">
	
	
		<table border="2">
		<caption><h1> Registration for Full-Stack Development</h1></caption>
			<tr>
			    <td bgcolor="yellow">User Name</td>
				
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
			<td bgcolor="yellow">Password</td>
				
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
			<td bgcolor="yellow">Email</td>
				
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
			<td bgcolor="yellow">Phone</td>
				
				<td><input type="text" name="phone"></td>
			</tr>
			<tr>
			
				<td></td>
				<td><input type="submit" name="register"></td>
			</tr>



		</table>


	</form>


</body>
</html>
