<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Fruit Store</title>

</head>
<body>

    <h1 class="container-sm mt-5 w-50">Fruit Store</h1>
    <div class="container-md mt-4 w-50">
        <table class="table table-hover">
            <thead>
                <tr>
                    <th scope="col">Name</th>
                    <th scope="col">Price</th>
                </tr>
            </thead>
            <tbody>
            	<c:forEach var="fruit" items="${fruitsFromMyController}">
                <tr>
                    <td><c:out value="${fruit.name}"></c:out></td>
                    <td><c:out value="${fruit.price}"></c:out></td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>


</body>
</html>