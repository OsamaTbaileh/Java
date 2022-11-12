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
	<title>Dojo Page</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

    <h1 class="container-sm mt-5 w-50">${dojo.name} Ninjas</h1>

    <table class="table table-hover container-md mt-4 w-50">
        <thead>
            <tr>
                <th scope="col">First Name</th>
                <th scope="col">Last Name</th>
          		<th scope="col">Age</th>
            </tr>
        </thead>
        <tbody>
        	<c:forEach var="ninja" items="${dojo.ninjas}">
            <tr>
                <td><c:out value="${ninja.firstName}"></c:out></td>
                <td><c:out value="${ninja.lastName}"></c:out></td>
                <td><c:out value="${ninja.age}"></c:out></td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
    
    
    <div class="d-flex justify-content-center my-3">
    	<a href="/ninjas/new"class="text-center btn btn btn-primary m-2">Add Ninja</a>
    	<a href="/dojos/new"class="text-center btn btn btn-primary m-2">Add Dojo</a>
    </div>

    <script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>