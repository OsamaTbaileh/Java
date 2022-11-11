<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Read Share</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

	    <h1 class="container-sm mt-5 w-50">Save Travels</h1>
    <div class="container-md mt-4 w-50">
        <table class="table table-hover">
            <thead>
                <tr>
                    <th scope="col">Expense</th>
                    <th scope="col">Vendor</th>
              		<th scope="col">Amount</th>
                </tr>
            </thead>
            <tbody>
            	<c:forEach var="expense" items="${expenseFromMyController}">
                <tr>
                    <td><c:out value="${expense.name}"></c:out></td>
                    <td><c:out value="${expense.vendor}"></c:out></td>
                    <td>$<c:out value="${expense.amount}"></c:out></td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    
    <h2 class="text-center mb-2 mt-5">Add an Expense:</h2>

    <form:form class="container-md w-50" action="/expenses" method="post" modelAttribute="expense">
    
    	<div class="text-danger">
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