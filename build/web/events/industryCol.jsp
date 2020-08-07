<%-- 
    Document   : industryCol
    Created on : Apr 7, 2019, 2:43:57 AM
    Author     : ISURU
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
         <%
            String UniversityName = session.getAttribute("NameUniversity").toString();
            String UserName = session.getAttribute("UserName").toString();
            String UserType = session.getAttribute("UserType").toString();
        %>
        <title><%=UniversityName%> - Co-operate Events</title>
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
<h2 align="center" style="color: #009900"> <font><strong> Opportunities for <%=UniversityName%></strong></font></h2>
<table align="center" cellpadding="8" cellspacing="8" border="0">
<tr>

</tr>
<tr bgcolor="#009900">

<td><b><font color="White">Event ID</font></b></td>
<td><b><font color="White">Industry Name</font></b></td>
<td><b><font color="White">Event Category</font></b></td>
<td><b><font color="White">Event Name</font></b></td>
<td><b><font color="White">Selected Universities</font></b></td>
<td><b><font color="White">Selected Subjects</font></b></td>
<td><b><font color="White">Event Venue</font></b></td>
<td><b><font color="White">Event Time</font></b></td>
<td><b><font color="White">Description</font></b></td>
</tr>
<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName ,userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM industry_post_events WHERE  tagUnivercity=? ORDER BY eventTime";
PreparedStatement preparedStatement = connection.prepareStatement(sql);
preparedStatement.setString(1,UniversityName);
resultSet = preparedStatement.executeQuery();
while(resultSet.next()){
%>

<tr bgcolor="#e6ffe6">

<td><%=resultSet.getString("eventID")%></td>
<td><%=resultSet.getString("industryName")%></td>
<td><%=resultSet.getString("eventCategory")%></td>
<td><%=resultSet.getString("eventName")%></td>
<td><%=resultSet.getString("tagUnivercity")%></td>
<td><%=resultSet.getString("tagCategory")%></td>
<td><%=resultSet.getString("eventVenue")%></td>
<td><%=resultSet.getString("eventTime")%></td>
<td><%=resultSet.getString("discription")%></td>


</tr>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
<br>
<br>
<div>
<br>
<h3 align="left"style="color: #009900"> <font><strong>Get social and leave your comment here...</strong></font></h3>
<br>
<form action="../IndustryColoServlet" id="usrform"  method="post">
<label for="subject">Selected University</label> 
<br>
<input type="text" name="UniName" align="right" readonly="true" value="<%=UniversityName%>">  
<br>
<label for="subject">Event ID</label> 
<br>
<input type="text" name="eventID" align="right" required >  
<br>
<label for="subject">User Type</label>
<br>
<input type="text" name="userType"align="right" readonly="true" value="<%=UserType%>" >
<br>

<label for="subject">Name</label> 
<br>
<input type="text" name="usrname" align="right" readonly="true" value="<%=UserName%>" >
<br>
<br>
 <label for="subject">Comment</label>  
<br>
<textarea rows="4" cols="50" name="comment" form="usrform">
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
<tr>

</tr>
<br>
<br>
</div>

<br>
<br>
<h3 align="left"style="color: #009900"> <font><strong>All comments are welcome...</strong></font></h3>
<table align="left" cellpadding="8" cellspacing="8" border="0">
<tr >

<tr bgcolor="#009900">
<td><b><font color="White">Name</font></b></td>
<td><b><font color="White">User Type</font></b></td> 
<td><b><font color="White">Event ID</font></b></td>
<td><b><font color="White">Comment</font></b></td>    


</tr>




<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName ,userId, password);
statement=connection.createStatement();
String sqlone ="SELECT * FROM industy_comment WHERE  univercity =?";
PreparedStatement preparedStatement1 = connection.prepareStatement(sqlone);
preparedStatement1.setString(1, UniversityName);
resultSet = preparedStatement1.executeQuery();
while(resultSet.next()){
%>

<tr>
<tr bgcolor="#e6ffe6">

<td><%=resultSet.getString("name") %></td>
<td><%=resultSet.getString("userType") %></td>
<td><%=resultSet.getString("evnetID") %></td>
<td><%=resultSet.getString("comment") %></td>

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
   
