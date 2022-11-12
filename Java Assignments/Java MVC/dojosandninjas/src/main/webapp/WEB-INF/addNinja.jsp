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
	<title>New Ninja</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

	<h2 class="text-center mb-2 mb-5">New Ninja</h2>
    <form:form class="container-md w-50" action="/ninjas/new" method="post" modelAttribute="ninja">
    
    	<div class="text-danger d-flex flex-column my-2">
	    	<form:errors path="dojo"/>
	    	<form:errors path="age"/>
	    	<form:errors path="firstName"/>
	    	<form:errors path="lastName"/>
    	</div>

        <form:label path="dojo" for="name">Dojo</form:label>
        <form:select path="dojo" class="form-control mb-3" id="name">
        	<c:forEach var="dojo" items="${dojosFromController}">
        		<option value="${dojo.id}">${dojo.name}</option>
        	</c:forEach>
        </form:select>
        
        
        <form:label path="firstName" for="firstName">First Name</form:label>      
        <form:input path="firstName" type="text" class="form-control mb-3" id="firstName"/>
        
         <form:label path="lastName" for="lastName">Last Name</form:label>      
        <form:input path="lastName" type="text" class="form-control mb-3" id="lastName"/>
        
        <form:label path="age" for="age">Age</form:label>       
        <form:input path="age" type="number" class="form-control mb-3" id="age"/>

        <input type="submit" value="Submit" class="btn btn-primary m-2">
    </form:form>
    
    
    <div class="d-flex justify-content-center my-3">
    	<a href="/dojos/new"class="text-center btn btn btn-primary">Add Dojo</a>
    </div>

    <script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>