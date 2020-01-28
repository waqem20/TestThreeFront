<html>
<head>
<title>Add a student page</title>
</head>
<body>
	<h2>Welcome to the student page</h2>
	<h3>Add your information below</h3>
	<br>
	<br>
	<form name="onemore" method="POST" action="addStudent">
		<table>
			<tr>
				<td><label>Name: *</label></td>
				<td><input id="name" name="name" type="text"
					placeholder="Enter your name" required /></td>
			</tr>
			<tr>
				<td><label>Age: </label></td>
				<td><input id="age" name="age" type="text"
					placeholder="Enter your age" /></td>
			</tr>
			<tr>
				<td><label>Date: *</label></td>
				<td><input id="date" name="date" type="text"
					placeholder="Enter your date"></td>
			</tr>
			<tr>
				<td><label>Email: *</label></td>
				<td><input id="email" name="email" type="text"
					placeholder="Enter your email" required /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add" /></td>
			</tr>
		</table>
	</form>
	
</body>
</html>