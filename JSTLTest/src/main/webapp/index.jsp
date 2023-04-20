<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tag Library</title>
</head>
<body>

<h1>Uso della direttiva di output</h1>
<c:out value="${'Ciao'}" />

<h1>Settare dei valori in variabile</h1>
<c:set var="spesa" value="${400*2}" />



<c:if test="${spesa > 700}">
<p>La mia spesa è: <c:out value="${spesa}"/></p>
</c:if>

<c:forEach var="i" begin="5" end="8">
<p>Elemento: <c:out value="${i}" /></p>
</c:forEach>



<c:set var="budget" value="${2000*4}" />
<h4>Il mio budget attuale è: <c:out value="${budget}" /></h4>

<c:choose >
	<c:when test="${budget < 10000 }">
		<p>Budget non molto alto</p>
	</c:when>
	
	<c:when test="${budget > 10000 }">
		<p>Budget abbastanza alto</p>
	</c:when>

	<c:otherwise>
		<p>Budget illimitato</p>
	</c:otherwise>
</c:choose>


</body>
</html>