<%-- 
    Document   : colUniCalender
    Created on : Apr 8, 2019, 12:59:26 AM
    Author     : HP
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%String UniversityName = session.getAttribute("NameUniversity").toString();//"University of Colombo";%>
        <title><%=UniversityName%> - Calender</title>
        <style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}
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
<table align="center" cellpadding="8" cellspacing="8" border="0">
<tr>

</tr>
<br>
<br>
<h2 align="center" style="color: #009900"> <font><strong>Academic Calendar of <%=UniversityName%></strong></font></h2>
<table align="left" cellpadding="8" cellspacing="8" border="0">
<tr >
<tr bgcolor="#009900">
<td><b><font color="White">Faculty</font></b></td>
<td><b><font color="White">Activity</font></b></td>
<td><b><font color="White">Activity Start Date</font></b></td>
<td><b><font color="White">Activity End Date</font></b></td>
<td><b><font color="White">Description</font></b></td>    
</tr>
<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName ,userId, password);
statement=connection.createStatement();
String sqlone ="SELECT * FROM activities WHERE organiztionName=? AND organiztionType ='university' ORDER BY activitySdate DESC ";
PreparedStatement preparedStatement = connection.prepareStatement(sqlone);
preparedStatement.setString(1,UniversityName);

resultSet = preparedStatement.executeQuery();
while(resultSet.next()){
%>

<tr>
<tr bgcolor="#e6ffe6">
<td><%=resultSet.getString("faculty") %></td>
<td><%=resultSet.getString("activity")%></td>
<td><%=resultSet.getString("activitySdate")%></td>
<td><%=resultSet.getString("activityEdate")%></td>
<td><%=resultSet.getString("discription")%></td>



</tr>


<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>


    </body>
</html>

