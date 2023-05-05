<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
    <%@page import="it.simo.project.model.*" %>
    <%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%


List<Persona> people = (List<Persona>)request.getAttribute("people");
for(Persona person : people)
{
    out.print("Id: " + person.getId());
    out.print("<br/>");
    out.print("Nome: " + person.getNome());
    out.print("<br/>");
    out.print("Anni: " + person.getAnni());
    
    out.print("<br/>");
    out.print("<br/>");
}
%>

<c:forEach items="${people}" var="user">
${user.getId()}
</c:forEach>
</body>
</html>