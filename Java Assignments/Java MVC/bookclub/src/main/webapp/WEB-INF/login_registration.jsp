<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Login & Registration</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

<div class="container-md">
	<div>
		<h1 class="md text-warning my-2">Book Club</h1>
		<p class="md text-warning">A place for friends to share thoughts on books</p>
	</div>
	<div class="d-flex mt-4">
	
		<div class="w-50 me-5">
		    <h1 class="text-center text-success mb-3">Register</h1>
	        <form:form action="/register" method="post" modelAttribute="newUser">   
	        	
				<form:errors path="userName" class="fw-bold text-danger d-block"/>
	        	<form:label path="userName" for="userName" class="fs-5 fw-bold text-success d-inlineblock">User Name</form:label>
	        	<form:input path="userName" type="text" class="form-control mb-3" id="userName"/>
	
				<form:errors path="email" class="fw-bold text-danger d-block"/>
	        	<form:label path="email" for="email" class="fs-5 fw-bold text-success">Email</form:label>
	        	<form:input path="email" type="email" class="form-control mb-3" id="email" />
	
	        	<form:errors path="password" class="fw-bold text-danger d-block"/>
	        	<form:label path="password" for="password" class="fs-5 fw-bold text-success">Password</form:label>
	        	<form:input path="password" type="password" class="form-control mb-3" id="password" />
	
		        <form:errors path="confirm" class="fw-bold text-danger d-block"/>
	        	<form:label path="confirm" for="confirm" class="fs-5 fw-bold text-success">Confirm Password</form:label>
	        	<form:input path="confirm" type="password" class="form-control mb-3" id="confirm"/>
	
					
				<div class="text-center">
			       <input type="submit" value="Register" class="btn btn-success fs-5 mb-3"/>
		        </div>
			</form:form>
		</div>
		<div class="w-50 ms-5">
			<h1 class="text-center text-success mb-3">Login</h1>
	        <form:form action="/login" method="post" modelAttribute="newLogin">   
	        
				<form:errors path="email" class="fw-bold text-danger d-block"/>
	        	<form:label path="email" for="email" class="fs-5 fw-bold text-success">Email</form:label>
	        	<form:input path="email" type="email" class="form-control mb-3" id="email" />
	
	        	<form:errors path="password" class="fw-bold text-danger d-block"/>
	        	<form:label path="password" for="password" class="fs-5 fw-bold text-success">Password</form:label>
	        	<form:input path="password" type="password" class="form-control mb-3" id="password" />
				
				<div class="text-center">
			       <input type="submit" value="Login" class="btn btn-success fs-5 mb-3"/>
		        </div> 
			</form:form>
		</div>
	</div>
</div>


    <script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>