<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Success</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<div class="container-md mt-3">
		<div class="d-flex justify-content-between">
			<div>
				<h1>Welcome ${currentUser.userName}</h1>
				<p>Books from everyone's shelves:
			</div>
			<div>
				<a href="/logout" class="btn btn-danger">Logout</a>
				<a href="/books/new" class="btn btn-primary">Add a book to my shelf!</a>
			</div>
		</div>
		

        <table class="table table-hover w-75 text-center ms-5">
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Title</th>
              		<th scope="col">Author</th>
              		<th scope="col">Posted By</th>
                </tr>
            </thead>
            <tbody>
            	<c:forEach var="book" items="${books}">
                <tr>
                    <td><c:out value="${book.id}"></c:out></td>
                    <td><a href="/books/${book.id}"><c:out value="${book.title}"></c:out></a></td>
                    <td><c:out value="${book.authorName}"></c:out></td>
                    <td>${book.user.userName}</td>

                </tr>
                </c:forEach>
            </tbody>
        </table>	
	</div>
	
	
    <script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>