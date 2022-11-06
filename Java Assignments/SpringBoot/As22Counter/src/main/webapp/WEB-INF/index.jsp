<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome, again</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

<h1 class="md text-center m-3" >Welcome User!</h1>
<div class="container-md d-flex justify-content-center">
	<a href="/your_server/counter" class="rounded p-3 m-3 bg-success text-white">Show Counter</a>
	<a href="/your_server/reset" class="rounded p-3 m-3 bg-danger text-white">Reset</a>
	<a href="/your_server/counter_add2" class="rounded p-3 m-3 bg-info text-white">Add 2</a>
</div>

</body>
</html>