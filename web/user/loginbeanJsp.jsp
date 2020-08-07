<%-- 
    Document   : loginbeanJsp
    Created on : Apr 2, 2019, 2:18:58 PM
    Author     : ISURU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page language="Java" import="java.sql.*" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <TITLE>DataBase Search</TITLE>
    </HEAD>  
<BODY>
<jsp:useBean id="db" scope="request" class="userBean.LoginBean" >
  <jsp:setProperty name="db" property="userName" value="<%=request.getParameter("username")%>"/>
  <jsp:setProperty name="db" property="password" value="<%=request.getParameter("password")%>"/>
 </jsp:useBean>
<jsp:forward page="hello">
  <jsp:param name="username" value="<%=db.getUsername()%>" />
  <jsp:param name="password" value="<%=db.getPassword()%>" />
</jsp:forward> 
</body>
</html>
