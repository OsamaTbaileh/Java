<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Product Page</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

	<div class="container-md">
		<h1 class="text-center my-3">${product.name}</h1>
		<a href="/" class="btn btn-primary my-2">Home</a>
		<hr>
		<h2 class="my-2">Categories:</h2>
		<ul class="mb-3">
   			<c:forEach var="product" items="${product.categories}">
    			<li>${product.name}</li>
    		</c:forEach>
		</ul>
		<hr>
	</div>
	
	<form class="container-md w-50" action="/products/${product.id}" method="post">

        <label  for="categories">Add Category:</label>
        <select name="categoryId" class="form-control mb-3" id="categories">
        	<c:forEach var="category" items="${categoriesNotBelongToThisProduct}">
        		<option value="${category.id}">${category.name}</option>
        	</c:forEach>
        </select>
        
        <input type="submit" value="Add" class="btn btn-primary m-2">
    </form>
		
	



    <script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>