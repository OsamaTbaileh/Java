<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isErrorPage="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>New Product</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	
    <form:form class="container-md w-50" action="/products/new" method="post" modelAttribute="product">
		<h1 class="text-center my-3">New Product</h1>
		<a href="/" class="btn btn-primary my-2">Home</a>
    	<div class="text-danger d-flex flex-column my-2">
	    	<form:errors path="name"/>
	    	<form:errors path="description"/>
	    	<form:errors path="price"/>
    	</div>

        <form:label path="name" for="name">Name:</form:label>
        <form:input path="name" type="text" class="form-control mb-3" id="name"/>
        
        <form:label path="description" for="description">Description:</form:label>       
        <form:input path="description" type="text" class="form-control mb-3" id="description"/>

        <form:label path="price" for="price">Price:</form:label>      
        <form:input path="price" type="number" class="form-control mb-3" id="price"/>

        <input type="submit" value="Submit" class="btn btn-success m-2">
    </form:form>
	
	

    <script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>