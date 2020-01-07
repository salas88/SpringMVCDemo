<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
	<head>
		<title> Student Form </title>
	</head>
	<body>
		<h2>Student Form</h2>
		
		<br><br>
		
		<form:form action="acsessForm" modelAttribute="myStudent">
			
			First name: <form:input path="firstName" />
			
			<br><br>
			
			Last Name: <form:input path="lastName" />
			
			<br><br>
			
			<form:select path="country">
			
				<form:options items="${myStudent.countryOptions}" />
				
			</form:select>
			
			<br><br>
			
			<input type="submit" value="Submit" />
			
		</form:form>
	</body>
</html>