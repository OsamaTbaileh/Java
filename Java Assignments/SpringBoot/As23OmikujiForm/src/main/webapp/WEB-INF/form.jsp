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

    <h2 class="text-center m-3">Send an Omikuji</h2>

    <form class="container-md w-50" action="/omikuji/form" method="post">
        <label for="number">Pick any number form 5 to 25:</label>
        <select class="form-control mb-3" id="number" name="number">
            <% for(int i=5; i<=25; i++) { %>
            <option><%= i %></option>
            <% } %>
        </select>

        <label for="city">Enter the name of any city:</label>
        <input type="text" class="form-control mb-3" id="city" name="city">

        <label for="person">Enter the name of any real person:</label>
        <input type="text" class="form-control mb-3" id="person" name="person">

        <label for="hobby">Enter professional endeavor or hobby:</label>
        <input type="text" class="form-control mb-3" id="hobby" name="hobby">

        <label for="thing">Enter any type of living thing:</label>
        <input type="text" class="form-control mb-3" id="thing" name="thing">

        <label for="say">Say something nice to someone:</label>
        <textarea class="form-control mb-3" id="say" rows="3" name="say"></textarea>

        <label >Send and show a friend</label>
        <input type="submit" value="Send" class="btn btn-primary m-2">
    </form>

<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>