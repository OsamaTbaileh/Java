<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Omikuji</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

<div class="container-md d-flex flex-column">
	<p class="text-center bg-primary border border-dark p-4 mt-5 mb-4">In ${number} years, 
	you will live in ${city} with ${person} as your roommate, ${hobby} for a living. 
	The next time you see a ${thing}, you will have good luck. Also, ${say}.</p>
	<a class="text-center" href="/omikuji">Go Back</a>
</div>

<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>