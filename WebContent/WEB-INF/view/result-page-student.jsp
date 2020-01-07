<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head><title>Show Student date</title></head>
	<body>
		First Name: ${myStudent.firstName}
		<br>
		Last Name: ${myStudent.lastName}
		<br>
		Country: ${myStudent.country}
		<br>
		Favorite Language: ${myStudent.favoriteLanguage }
		<br>
		Operating Systems:
		<ul>
			<c:forEach var="temp" items="${myStudent.operatingSystems}">
			<li>${temp}</li>
			</c:forEach>
		</ul>
	</body>
</html>