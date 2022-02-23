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
			All Books
		</h1>
		<table>
        	<thead>
		        <tr>
		            <th>ID</th>
		            <th>Title</th>
		            <th>Language</th>
		            <th>Number of Pages</th>
		        </tr>
		    </thead>
        	<tbody>
				<c:forEach var="book" items="${booksList}">
					<tr>
                    	<td><c:out value="${book.getId()}"/></td>
                        <td>
                        	<form action="/books/${book.getId()}" method="GET">
								<button type="submit" class="link">
									<c:out value="${book.getTitle()}"/>
								</button>
							</form>
						</td>
                        <td><c:out value="${book.getLang()}"/></td>
                        <td><c:out value="${book.getNumOfPages().intValue()}"/></td>
					</tr>
            	</c:forEach>
			</tbody>
		</table>
	</body>
</html>