<%-- 
    Document   : AFResearch
    Created on : May 25, 2019, 8:30:35 AM
    Author     : ISURU
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Research - Accounting & Finance</title>
          <style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

input[type=submit] {
  background-color: #008000 ;
  color: white;
  font-size: 16px;
  padding: 12px 20px;
  border: 2px solid #4CAF50;
  border-radius: 4px;
  display: inline-block;
  cursor: pointer;
  float: left;
}
input[type=text],select {
  width: 30%;
  padding: 8px 20px;
  margin: 8px 0;  
  border: 2px solid #4CAF50;
  border-radius: 4px;
} 
textarea{
 width: 35%;
 padding: 12px 20px;
 margin: 8px 0;   
 border: 2px solid #4CAF50;
 border-radius: 4px;    
}
label{
    
font-size: 16px;
}
div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}

    </style>
    </head>
    <body>
        
       <%
String id = request.getParameter("uniEventID");
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "plymouth";
String userId = "root";
String password = "";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
    <%
        String UserName = session.getAttribute("UserName").toString();
        String UserType = session.getAttribute("UserType").toString();
    %>

<h2 align="center" style="color: #009900"> <font><strong>Research - Accounting & Finance</strong></font></h2>
<h3> </h3>
<table align="center" cellpadding="8" cellspacing="8" border="0">
<tr>

</tr>
<tr bgcolor="#009900">

<td><b><font color="White">Author Name</font></b></td>
<td><b><font color="White">User Type</font></b></td>
<td><b><font color="White">Headline</font></b></td>
<td><b><font color="White">University</font></b></td>
<td><b><font color="White">Email</font></b></td>
<td><b><font color="White">PDF</font></b></td>
<td><b><font color="White">Description</font></b></td>

</tr>
<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName ,userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM post_reseach WHERE subject='Accounting & Finance'";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr bgcolor="#e6ffe6">

<td><%=resultSet.getString("name") %></td>
<td><%=resultSet.getString("userType") %></td>
<td><%=resultSet.getString("headline") %></td>
<td><%=resultSet.getString("university") %></td>
<td><%=resultSet.getString("email") %></td>
<td>
    <form  method="get" action="../ReseachFileReadPdf" enctype="multipart/">
        <input type="hidden" name="doc" value="<%=resultSet.getString("researchID") %>"/>
    <input  type="submit"  value="Open PDF" />
    </form>
    
</td>
<td><%=resultSet.getString("details") %></td>
</tr>


<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
<br>
<div>
<h3 align="left"style="color: #009900"> <font><strong> ASK US - Queries ...</strong></font></h3>
<br>

<form action="../ComputerSceinceQuServlet" id="usrform"  method="post">
<input type="hidden" name="Category" value="Accounting & Finance"/> 
<label for="subject">Name </label> 
<br>
<input type="text" name="name" align="right" readonly="true" value="<%=UserName%>" >  
<br>
<label for="subject">User Type </label>
<br>
<input type="text" name="userType" align="right" readonly="true" value="<%=UserType%>" > 
<br>
<br>
<label for="subject">Ask From </label>
<br>
        <select name="askFrom" required>
            <option value=""></option>
            <option value="student">Student</option>
            <option value="univercity">University</option>
            <option value="industry">Industry</option>
            <option value="member">Member</option>    
        </select>
<br>
<br>
 <label for="subject">Query  </label>  
<br>
<textarea rows="4" cols="50" name="query" form="usrform">
</textarea>
<br>
<input type="submit" value="Enter">
<br>
</form>
<br>
<br>

<p><b>Note : please do not Abusive, vulgar, obscene, racist, threatening, or harassing comments.</b> </p>
<br>
</div>
<table align="center" cellpadding="8" cellspacing="8" border="0">
</div>
<h3 align="left"style="color: #009900"> <font><strong>Answer Query...</strong></font></h3>
<table align="left" cellpadding="8" cellspacing="8" border="0">
<tr>
<tr bgcolor="#009900">
<td><b><font color="White">Name</font></b></td>
<td><b><font color="White">User Type</font></b></td> 
<td><b><font color="White">Ask From </font></b></td>
<td><b><font color="White">Query</font></b></td>    
</tr>
<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName ,userId, password);
statement=connection.createStatement();
String sqlone ="SELECT * FROM query WHERE subject ='Accounting & Finance'";



resultSet = statement.executeQuery(sqlone);
while(resultSet.next()){
%>

<tr>
<tr bgcolor="#e6ffe6">
<td><%=resultSet.getString("name") %></td>
<td><%=resultSet.getString("userType") %></td>
<td><%=resultSet.getString("askFrom") %></td>
<td><%=resultSet.getString("query") %></td>

</tr>


<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>

    </body>
    <br>

</html>

