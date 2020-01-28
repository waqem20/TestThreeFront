<%@page contentType="text/html;charset = UTF-8" language="java"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>TestThree</title>
</head>
<body>
	<h2>Submitted Student Information</h2>
	<table>
		<tr>
			<td>Name</td>
			<td>${person.name}</td>
		</tr>
		<tr>
			<td>Age</td>
			<td>${person.age}</td>
		</tr>
		<tr>
			<td>Email</td>
			<td>${person.email}</td>
		</tr>
		<tr>
			<td>Date</td>
			<td>${person.date}</td>
		</tr>
		<tr>
			<td><a href="/TestThreeClient/studentRegistry">Proceed to edit student page</a></td>
		</tr>
	</table>
</body>
</html>