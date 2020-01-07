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
			
			Favorite Language:
			<br>
			Java<form:radiobutton path="favoriteLanguage" value="Java"/>
			Kotlin<form:radiobutton path="favoriteLanguage" value="Kotlin"/>
			C#<form:radiobutton path="favoriteLanguage" value="C#"/>
			PHP<form:radiobutton path="favoriteLanguage" value="PHP"/>
			
			<br><br>
			
			Operating systems:
			<br>
			Linux<form:checkbox path="operatingSystems" value="Linux"/>
			Mac OC<form:checkbox path="operatingSystems" value="Mac OC"/>
			MS Windows<form:checkbox path="operatingSystems" value="MS Windows"/>
			
			
			<br><br>
			
			
			
			<input type="submit" value="Submit" />
			
		</form:form>
	</body>
</html>