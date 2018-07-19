<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="samplePersonServiceImplementationProxyid" scope="session" class="com.sample.PersonServiceImplementationProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
samplePersonServiceImplementationProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = samplePersonServiceImplementationProxyid.getEndpoint();
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
        samplePersonServiceImplementationProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.sample.PersonServiceImplementation getPersonServiceImplementation10mtemp = samplePersonServiceImplementationProxyid.getPersonServiceImplementation();
if(getPersonServiceImplementation10mtemp == null){
%>
<%=getPersonServiceImplementation10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 15:
        gotMethod = true;
        String age_2id=  request.getParameter("age20");
        int age_2idTemp  = Integer.parseInt(age_2id);
        String mName_3id=  request.getParameter("mName22");
            java.lang.String mName_3idTemp = null;
        if(!mName_3id.equals("")){
         mName_3idTemp  = mName_3id;
        }
        String fName_4id=  request.getParameter("fName24");
            java.lang.String fName_4idTemp = null;
        if(!fName_4id.equals("")){
         fName_4idTemp  = fName_4id;
        }
        String id_5id=  request.getParameter("id26");
        int id_5idTemp  = Integer.parseInt(id_5id);
        String lName_6id=  request.getParameter("lName28");
            java.lang.String lName_6idTemp = null;
        if(!lName_6id.equals("")){
         lName_6idTemp  = lName_6id;
        }
        %>
        <jsp:useBean id="com1sample1Person_1id" scope="session" class="com.sample.Person" />
        <%
        com1sample1Person_1id.setAge(age_2idTemp);
        com1sample1Person_1id.setMName(mName_3idTemp);
        com1sample1Person_1id.setFName(fName_4idTemp);
        com1sample1Person_1id.setId(id_5idTemp);
        com1sample1Person_1id.setLName(lName_6idTemp);
        boolean addPerson15mtemp = samplePersonServiceImplementationProxyid.addPerson(com1sample1Person_1id);
        String tempResultreturnp16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addPerson15mtemp));
        %>
        <%= tempResultreturnp16 %>
        <%
break;
case 30:
        gotMethod = true;
        String id_7id=  request.getParameter("id33");
        int id_7idTemp  = Integer.parseInt(id_7id);
        boolean deletePerson30mtemp = samplePersonServiceImplementationProxyid.deletePerson(id_7idTemp);
        String tempResultreturnp31 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deletePerson30mtemp));
        %>
        <%= tempResultreturnp31 %>
        <%
break;
case 35:
        gotMethod = true;
        String id_8id=  request.getParameter("id48");
        int id_8idTemp  = Integer.parseInt(id_8id);
        com.sample.Person getPerson35mtemp = samplePersonServiceImplementationProxyid.getPerson(id_8idTemp);
if(getPerson35mtemp == null){
%>
<%=getPerson35mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">age:</TD>
<TD>
<%
if(getPerson35mtemp != null){
%>
<%=getPerson35mtemp.getAge()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">mName:</TD>
<TD>
<%
if(getPerson35mtemp != null){
java.lang.String typemName40 = getPerson35mtemp.getMName();
        String tempResultmName40 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemName40));
        %>
        <%= tempResultmName40 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">fName:</TD>
<TD>
<%
if(getPerson35mtemp != null){
java.lang.String typefName42 = getPerson35mtemp.getFName();
        String tempResultfName42 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typefName42));
        %>
        <%= tempResultfName42 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(getPerson35mtemp != null){
%>
<%=getPerson35mtemp.getId()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">lName:</TD>
<TD>
<%
if(getPerson35mtemp != null){
java.lang.String typelName46 = getPerson35mtemp.getLName();
        String tempResultlName46 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typelName46));
        %>
        <%= tempResultlName46 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 50:
        gotMethod = true;
        com.sample.Person[] getAllPersons50mtemp = samplePersonServiceImplementationProxyid.getAllPersons();
if(getAllPersons50mtemp == null){
%>
<%=getAllPersons50mtemp %>
<%
}else{
        String tempreturnp51 = null;
        if(getAllPersons50mtemp != null){
        java.util.List listreturnp51= java.util.Arrays.asList(getAllPersons50mtemp);
        tempreturnp51 = listreturnp51.toString();
        }
        %>
        <%=tempreturnp51%>
        <%
}
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