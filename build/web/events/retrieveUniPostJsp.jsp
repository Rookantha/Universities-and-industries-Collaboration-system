<%-- 
    Document   : retrieveUniPostJsp
    Created on : Apr 3, 2019, 10:48:41 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All University Events</title>
    <style>
body {
  font-family: "Lato", sans-serif;
    
    
    </style>
    </head>
    <body>
<%
String id = request.getParameter("userId");
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
<h2 align="center" style="color: #4d88ff"><font><strong>All Upcoming University Events Order by Date</strong></font></h2>
<table align="center" cellpadding="6" cellspacing="6" border="0">
<tr>

</tr>
<tr bgcolor="#ccccff">
<td><b>University Name</b></td>
<td><b>Event Category</b></td>
<td><b>Event Name</b></td> 
<td><b>Selected Universities</b></td>
<td><b>Selected Subjects</b></td>
<td><b>Event Venue</b></td>
<td><b>Event Time</b></td>
<td><b>Description</b></td>
</tr>
<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName , userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM university_post_events ORDER BY eventTime DESC";


resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr bgcolor="#4dff4d">

<td><%=resultSet.getString("universityName") %></td>
<td><%=resultSet.getString("eventCategory") %></td>
<td><%=resultSet.getString("eventName") %></td>
<td><%=resultSet.getString("tagUniversity") %></td>
<td><%=resultSet.getString("tagCategory") %></td>
<td><%=resultSet.getString("eventVenue") %></td>
<td><%=resultSet.getString("eventTime") %></td>
<td><%=resultSet.getString("discription") %></td>


</tr>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
    </body>
</html>
