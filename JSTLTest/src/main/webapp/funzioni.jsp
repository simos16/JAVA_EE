<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Funzioni</title>
</head>
<body>
<h1>Contains</h1>
<c:set var="string" value="BENVENUTI AL CORSO DI JAVA" />  
  
<c:if test="${fn:contains(string, 'JAVA')}">  
   <p>Ho trovato la stringa corrispondente in  ${string} <p>  
</c:if>  
  

<h1>Trim&Length</h1>

<c:set var="str1" value="BENVENUTI AL     CORSO DI JAVA        "/>  
<p>String-1 Length is : ${fn:length(str1)}</p>  
  
<c:set var="str2" value="${fn:trim(str1)}" />  
<p>Lunghezza String-2: ${fn:length(str2)}</p>  
<p>Lunghezza dopo trim: ${str2}</p>  



<h1>Split&Join</h1>
<c:set var="str1" value="BENVENUTI-AL-CORSO-DI-JAVA"/>  
<c:set var="str2" value="${fn:split(str1, '-')}" />  
<c:set var="str3" value="${fn:join(str2, ' ')}" />  
  
<p>String-3 : ${str3}</p>  
<c:set var="str4" value="${fn:split(str3, ' ')}" />  
<c:set var="str5" value="${fn:join(str4, '/')}" />  
  
<p>String-5 : ${str5}</p> 

<h1>Lower&Upper</h1> 
<c:set var="string" value="BENVENUTI AL CORSO DI JAVA"/>  
${fn:toLowerCase("java")}  
${fn:toLowerCase(string)} 
<hr>
<c:set var="testo" value="benvenuti al corso di java"/>  
  <c:set var="copyright" value="Simona"/>  
 Questo testo ${fn:toUpperCase(testo)} è stato scritto da ${fn:toUpperCase(copyright)}.  
  
  <h1>Replace</h1>
  <c:set var="autore" value="autore"/>  
<c:set var="string" value="J."/>  
${fn:replace(autore, "autore", "Tolkien")}  
${fn:replace(string, "J.", "Tolkien")}  

</body>
</html>