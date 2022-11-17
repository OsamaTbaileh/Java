<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${theLanguage.name}</title>
</head>
<body>
	<h3>Language Name:</h3>
	<p>${theLanguage.name}</p>
	<h3>Language Creator:</h3>
	<p>${theLanguage.creator}</p>
	<h3>Language Version:</h3>
	<p>${theLanguage.version}</p>
	<a href="/languages/edit/${theLanguage.id}">Edit</a>
	<a href="/delete/${theLanguage.id}">Delete</a>
	<a href="/">Dashboard</a>
</body>
</html>