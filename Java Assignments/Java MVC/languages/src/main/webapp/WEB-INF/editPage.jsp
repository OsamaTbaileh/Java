<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${updatedlanguage.name}</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<div style="display: flex; flex-direction: row; justify-content: space-evenly;">
		<h1>Edit your Language:</h1>
		<a href="/">Dashboard </a>
		<a href="/delete/${updatedlanguage.id}">Delete</a>
	</div>
	<form:form action="/languages/edit/${updatedlanguage.id}" method="put" modelAttribute="updatedlanguage">
		<div class="form-group">
			<form:label path="name">Name:</form:label>
			<form:errors path="name"></form:errors>
			<form:input path="name" class="form-control"/>
		</div>
		<div class="form-group">
			<form:label path="creator">Creator:</form:label>
			<form:errors path="creator"/>
			<form:input path="creator" class="form-control"/>
		</div>
		<div class="form-group">
			<form:label path="Version">Version:</form:label>
			<form:errors path="Version"/>
			<form:input path="Version" class="form-control"/>
		</div>
	<button type="submit" class="btn btn-primary">Update</button>
	</form:form>
</body>
</html>