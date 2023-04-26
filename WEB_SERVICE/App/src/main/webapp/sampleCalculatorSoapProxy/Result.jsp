<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleCalculatorSoapProxyid" scope="session" class="org.tempuri.CalculatorSoapProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleCalculatorSoapProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleCalculatorSoapProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleCalculatorSoapProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        org.tempuri.CalculatorSoap getCalculatorSoap10mtemp = sampleCalculatorSoapProxyid.getCalculatorSoap();
if(getCalculatorSoap10mtemp == null){
%>
<%=getCalculatorSoap10mtemp %>
<%
}else{
        if(getCalculatorSoap10mtemp!= null){
        String tempreturnp11 = getCalculatorSoap10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String intA_1id=  request.getParameter("intA16");
        int intA_1idTemp  = Integer.parseInt(intA_1id);
        String intB_2id=  request.getParameter("intB18");
        int intB_2idTemp  = Integer.parseInt(intB_2id);
        int add13mtemp = sampleCalculatorSoapProxyid.add(intA_1idTemp,intB_2idTemp);
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(add13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
break;
case 20:
        gotMethod = true;
        String intA_3id=  request.getParameter("intA23");
        int intA_3idTemp  = Integer.parseInt(intA_3id);
        String intB_4id=  request.getParameter("intB25");
        int intB_4idTemp  = Integer.parseInt(intB_4id);
        int subtract20mtemp = sampleCalculatorSoapProxyid.subtract(intA_3idTemp,intB_4idTemp);
        String tempResultreturnp21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(subtract20mtemp));
        %>
        <%= tempResultreturnp21 %>
        <%
break;
case 27:
        gotMethod = true;
        String intA_5id=  request.getParameter("intA30");
        int intA_5idTemp  = Integer.parseInt(intA_5id);
        String intB_6id=  request.getParameter("intB32");
        int intB_6idTemp  = Integer.parseInt(intB_6id);
        int multiply27mtemp = sampleCalculatorSoapProxyid.multiply(intA_5idTemp,intB_6idTemp);
        String tempResultreturnp28 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(multiply27mtemp));
        %>
        <%= tempResultreturnp28 %>
        <%
break;
case 34:
        gotMethod = true;
        String intA_7id=  request.getParameter("intA37");
        int intA_7idTemp  = Integer.parseInt(intA_7id);
        String intB_8id=  request.getParameter("intB39");
        int intB_8idTemp  = Integer.parseInt(intB_8id);
        int divide34mtemp = sampleCalculatorSoapProxyid.divide(intA_7idTemp,intB_8idTemp);
        String tempResultreturnp35 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(divide34mtemp));
        %>
        <%= tempResultreturnp35 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>