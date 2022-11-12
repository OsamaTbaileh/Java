<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>New Dojo</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

	<h2 class="text-center mb-2 mb-5">New Dojo</h2>
	    <form:form class="container-md w-50" action="/dojos/new" method="post" modelAttribute="dojo">
    
    	<div class="text-danger d-flex flex-column my-2">
	    	<form:errors path="name"/>
    	</div>

        <form:label path="name" for="name">Name:</form:label>
        <form:input path="name" type="text" class="form-control mb-3" id="name"/>

        <input type="submit" value="Create" class="btn btn-primary m-2">
    </form:form>

    <script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	
	<div class="d-flex justify-content-center my-3">
    	<a href="/ninjas/new"class="text-center btn btn btn-primary">Add Ninja</a>
    </div>
</body>
</html>