<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>


	<div class="container-md mt-3">
		<div class="d-flex justify-content-between">
			<div>
				<h1>${book.title}</h1>
			</div>
			<div>
				<a href="/books" class="btn btn-primary">Back to the shelves!</a>
			</div>
		</div>
		<c:choose>
    		<c:when test="${book.user.id == userId}">
					<p>You read ${book.title} by ${book.authorName}.</p>
					<p>Here are ${book.user.userName}'s thoughts:</p>
			</c:when>    
	    	<c:otherwise>
					<p>${book.user.userName} read ${book.title} by ${book.authorName}.</p>
					<p>Here are your thoughts:</p>
	    	</c:otherwise>
		</c:choose>
		
		<p>${book.thoughts}</p>
		
		<c:choose>
			<c:when test="${book.user.id == userId}">
				<div class="d-flex justify-content-between w-25 mt-5">
					<div>
						<a href="/books/${book.id}/edit" class="btn btn-primary">Edit</a>
					</div>
					<div>
						<a href="/books/${book.id}/delete" class="btn btn-primary">Delete</a>
					</div>
				</div>
			</c:when>    
	    	<c:otherwise>
  	
    		</c:otherwise>
		</c:choose>
			

	</div>



    <script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>