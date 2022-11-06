<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Current visit count</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

<p class="md text-center">Note: when You visit (/your_server) it icrease the counter by 1, and when you visit the (/your_server/counter_add2)it increases the counter by 2, and when you visit (/your_server/counter) it shows the counter.</p>
<h2 class="md text-center">You have visited <a href="/your_server"> http://your_server </a><c:out value="${count}"></c:out> times.</h2>

<div class="container-md d-flex justify-content-center">
	<a href="/your_server" class="rounded p-3 m-3 bg-success text-white">Test another visit?(add 1)</a>
	<a href="/your_server/counter_add2" class="rounded p-3 m-3 bg-success text-white">Test another visit?(add 2)</a>
</div>

</body>
</html>