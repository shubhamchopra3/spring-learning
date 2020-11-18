<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>

<title>Student form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">'
	
	First Name : <form:input path="firstName" />
	<form:errors path="firstName" cssClass="error"></form:errors>

	Last Name : <form:input path="lastName" />
	
	Passes : <form:input path="passes" />
	<form:errors path="passes" cssClass="error"></form:errors>
	
	Pin code : <form:input path="postalCode" />
	<form:errors path="postalCode" cssClass="error"></form:errors>
	
	Course Code  : <form:input path="courseCode" />
	<form:errors path="courseCode" cssClass="error"></form:errors>
	
	<input type="submit">

	</form:form>

</body>
</html>