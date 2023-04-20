<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>      

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Format</title>
</head>
<body>
<h1>Convertiamo dei valori</h1>

<fmt:formatNumber var="num" value="2300.7896" type="CURRENCY" maxFractionDigits="2"  minFractionDigits="2" pattern="###.##"></fmt:formatNumber>

<h2>Numero formattato: ${num} €</h2>

<h3>parseNumber</h3>  
  
<c:set var="importo" value="786.970" />  
  
    <fmt:parseNumber var="num" type="number" value="${importo}" />  
    <p><i>Il totale:</i>  <c:out value="${num}" /></p>  
  
    <fmt:parseNumber var="num" integerOnly="true" type="number" value="${importo}" />  
    <p><i>Totale:</i>  <c:out value="${num}" /></p>  

<h1>Formattazione date</h1>


<c:set var="data" value="<%= new Date()%>" />  
<p>  
ORARIO :  
<fmt:formatDate type="time" value="${data}" />  
</p>  
<p>  
DATA FORMATTATA :  
<fmt:formatDate type="date" value="${data}" />  
</p>  
<p>  
ORARIO E DATA :  
<fmt:formatDate type="both" value="${data}" />  
</p>  
<p>  
STILE COMPRESSO :  
<fmt:formatDate type="both" dateStyle="short" timeStyle="short"  
value="${data}" />  
</p>  
<p>  
STILE MEDIAMENTE ESTESO :  
<fmt:formatDate type="both" dateStyle="medium" timeStyle="medium"  
value="${data}" />  
</p>  
<p>  
STILE PIU' AMPIO :  
<fmt:formatDate type="both" dateStyle="long" timeStyle="long"  
value="${data}" />  
</p>  

</body>
</html>