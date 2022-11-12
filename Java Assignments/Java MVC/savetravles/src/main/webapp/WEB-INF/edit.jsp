<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Edit My Task</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

    <a href="/expenses">Go Back</a>
    <h2 class="text-center mb-2 mt-5">Edit an Expense:</h2>

    <form:form class="container-md w-50" action="/expenses/edit/${expense.id}" method="post" modelAttribute="expense">
    	<input type="hidden" name="_method" value="put">	
    	<div class="text-danger d-flex flex-column my-2">
	    	<form:errors path="name"/>
	    	<form:errors path="vendor"/>
	    	<form:errors path="amount"/>
	    	<form:errors path="description"/>
    	</div>

        <form:label path="name" for="name">Expense Name</form:label>
        <form:input path="name" type="text" class="form-control mb-3" id="name"/>
        
        <form:label path="vendor" for="vendor">Vendor</form:label>       
        <form:input path="vendor" type="text" class="form-control mb-3" id="vendor"/>

        <form:label path="amount" for="amount">Amount</form:label>      
        <form:input path="amount" type="number" class="form-control mb-3" id="amount"/>

        <form:label path="description" for="description">Description</form:label>       
        <form:textarea path="description" class="form-control mb-3" id="description" rows="3"/>

        <input type="submit" value="Submit" class="btn btn-primary m-2">
    </form:form>
    
    
    <script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>