<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Show Expense</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

    <a href="/expenses">Go Back</a>
    <h2 class="text-center mb-2 mb-5">Expense Details</h2>
    
    <div class="container-md w-50 d-flex justify-content-around mb-2">
	    <div>
	    	<h4>Expense Name:</h4>
	    	<h4>Expense Description:</h4>
	    	<h4>Vendor:</h4>
	    	<h4>Amount Spent:</h4>
    	</div>
   		<div>
	    	<h4>${expense.name}</h4>
	    	<h4>${expense.description}</h4>
	    	<h4>${expense.vendor}</h4>
	    	<h4>$${expense.amount}</h4>
    	</div>
    </div>
    
    <script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>