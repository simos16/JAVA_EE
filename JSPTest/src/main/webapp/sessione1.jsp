<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pagina 1</title>
</head>
<body>
<%   
  
String nome = request.getParameter("nome");  
out.print("Benvenuto " + nome);    
session.setAttribute("utente", nome);  
   
%> 
<a href="sessione2.jsp">Vai a pagina 2</a>   


<%= request.getParameter("colore") %>  
</body>
</html>