<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>
			Login
		</title>
		<link rel="stylesheet" type="text/css" href="/css/style.css">
		<script type="text/javascript" src="js/app.js"></script>
		
		<!-- para CSS en Bootstrap -->
		<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
		<!-- Para cualquier Bootstrap que use JS o jQuery -->
		<script src="/webjars/jquery/jquery.min.js"></script>
		<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	</head>
	<body>
	    <h1>
			<c:out value="${book.getTitle()}"/>
		</h1>
		<h3>
			Description: <c:out value="${book.getDescr()}"/>
		</h3>
		<h3>
			Language: <c:out value="${book.getLang()}"/>
		</h3>
		<h3>
			Number of Pages: <c:out value="${book.getNumOfPages().intValue()}"/>
		</h3>
	</body>
</html>