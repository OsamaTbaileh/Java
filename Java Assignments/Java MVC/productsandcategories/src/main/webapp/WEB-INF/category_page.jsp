<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Category Page</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

	<div class="container-md">
		<h1 class="text-center my-3">${category.name}</h1>
		<a href="/" class="btn btn-primary my-2">Home</a>
		<hr>
		<h2 class="my-2">Products:</h2>
		<ul class="mb-3">
   			<c:forEach var="category" items="${category.products}">
    			<li>${category.name}</li>
    		</c:forEach>
		</ul>
		<hr>
	</div>
	
	<form class="container-md w-50" action="/categories/${category.id}" method="post">
 	
        <label  for="products">Add Product:</label>
        <select name="productId" class="form-control mb-3" id="products">
        	<c:forEach var="product" items="${productsNotBelongToThisCategory}">
        		<option value="${product.id}">${product.name}</option>
        	</c:forEach>
        </select>
        
        <input type="submit" value="Add" class="btn btn-primary m-2">
    </form>
    
    
    
    <script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>