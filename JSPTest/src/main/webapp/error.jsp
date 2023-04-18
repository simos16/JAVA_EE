<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pagina di errore</title>
</head>
<body>
<%= exception.getMessage() %>
<h1>Sorry, si è verificato un errore.</h1>
<h3><a href="index.jsp">Torna alla home</a></h3>


</body>
</html>