<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dettagli prodotto</title>
</head>
<body>
<jsp:useBean id="prodotto" class="it.simo.jsp.bean.ProdottoBean" scope="session">
  <jsp:setProperty name="prodotto" property="*" />
 </jsp:useBean>
 
<h1>Dettagli del prodotto</h1>
 <br /> Id:<jsp:getProperty property="id" name="prodotto" />
 <br /> Nome:<jsp:getProperty property="nome" name="prodotto" />
 <br /> Descrizione:<jsp:getProperty property="descrizione" name="prodotto" />
 <br /> Prezzo:<jsp:getProperty property="prezzo" name="prodotto" />
 
 
 
 <%--<a href="bean2.jsp">vai alla seconda pagina</a> --%>
 
 
</body>
</html>