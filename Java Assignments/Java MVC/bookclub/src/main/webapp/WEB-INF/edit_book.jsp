<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Edit Book</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>


	<div class="container-md">
		<div class="d-flex justify-content-between align-items-center my-3">
			<div>
				<h1>Change your Entry</h1>
			</div>
			<div>
				<a href="/books" class="btn btn-primary">Back to the shelves</a>
			</div>
		</div>
		
		<form:form class="container-md w-75" action="/books/${newBook.id}/edit" method="post" modelAttribute="newBook">
			<input type="hidden" name="_method" value="put">
	
			<form:errors path="title" class="fw-bold text-danger d-block"/>
        	<form:label path="title" for="title" class="fs-5 fw-bold text-success d-inlineblock">Title:</form:label>
        	<form:input path="title" type="text" class="form-control mb-3" id="title"/>

			<form:errors path="authorName" class="fw-bold text-danger d-block"/>
        	<form:label path="authorName" for="authorName" class="fs-5 fw-bold text-success">Author:</form:label>
        	<form:input path="authorName" type="text" class="form-control mb-3" id="authorName" />

			<form:errors path="thoughts" class="fw-bold text-danger d-block"/>	
	        <form:label path="thoughts" for="thoughts" class="fs-5 fw-bold text-success">My thoughts:</form:label>       
	        <form:textarea path="thoughts" class="form-control mb-3" id="thoughts" rows="5"/>
	        
	        <form:input type="hidden" path="user" value="${userId}"/>
	
	        <input type="submit" value="Submit" class="btn btn-primary m-2">
	    </form:form>
		
	</div>



    <script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>