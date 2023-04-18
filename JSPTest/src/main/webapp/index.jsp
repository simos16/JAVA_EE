<%@ page import="java.time.LocalDate" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
<h1>Test di una jsp</h1>
<h1>Aggiungere una scriptlet</h1>
<h2><% out.print("Sono una scriplet"); %></h2>

<h1>Gestire un'espressione</h1>
<h2>La somma  è: <%= 2 * 3 + 4 %></h2>
<h1>Dichiaro variabili</h1>
<%! 
 int num = 5; 
 int num1 = 6; 
%>

<h2><% out.print(num + num1); %></h2>

<h1>Recuperiamo parametri</h1>
<p><% 
 String colore = request.getParameter("colore"); 
 String misura = request.getParameter("misura"); 
 out.println("Scrivo i parametri: " + "<b>" + colore +"</b>" + " e " + misura);
 //out.println(colore + " " + misura);
%></p>

<h1>Utilizza una libreria con import</h1>
<h2>Oggi è: <% 
 LocalDate data = LocalDate.now();
 out.print(data);
%> </h2>

<%-- <jsp:forward page="sessione1.jsp" />   --%>

<%--<jsp:forward page="sessione1.jsp" >  
<jsp:param name="colore" value="sono il colore rosso" />  
</jsp:forward>--%>  

</body>
</html>