<%-- 
    Document   : adminHome
    Created on : Apr 4, 2019, 8:24:32 PM
    Author     : HP
--%>

<%@page import="java.io.OutputStream"%>
<%@page import="java.io.ByteArrayInputStream"%>
<%@page import="java.sql.Blob"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="refresh" content="10" />
        <title>Administrator Home</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
 
<style>
body {
  font-family: "Lato", sans-serif;
}

.sidebar {
  height: 100%;
  width: 0;
  position: fixed;
  z-index: 1;
  top: 0;
  left: 0;
  background-color: #111;
  overflow-x: hidden;
  transition: 0.5s;
  padding-top: 60px;
}

.sidebar a {
  padding: 8px 8px 8px 32px;
  text-decoration: none;
  font-size: 25px;
  color: #818181;
  display: block;
  transition: 0.3s;
}

.sidebar a:hover {
  color: #f1f1f1;
}

.sidebar .closebtn {
  position: absolute;
  top: 0;
  right: 25px;
  font-size: 36px;
  margin-left: 50px;
}

.openbtn {
  font-size: 20px;
  cursor: pointer;
  background-color: #111;
  color: white;
  padding: 10px 15px;
  border: none;
}

.openbtn:hover {
  background-color: #444;
}

#main {
  transition: margin-left .5s;
  padding: 16px;
}

/* On smaller screens, where height is less than 450px, change the style of the sidenav (less padding and a smaller font size) */
@media screen and (max-height: 450px) {
  .sidebar {padding-top: 15px;}
  .sidebar a {font-size: 18px;}
}
</style>
</head>
<body>
<div id="mySidebar" class="sidebar">
    <%
        String UserName = session.getAttribute("UserName").toString();
    %>
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">×</a>
  <a href="#" style="color:yellow"><%=UserName%></a>
  <a href="http://localhost:8080/plymouthapp/user/addUniversityJsp.jsp" target="new">University Account</a>
  <a href="http://localhost:8080/plymouthapp/user/addIndustryJsp.jsp" target="new">Industry Account</a>
  <a onclick="Navigate()" style="cursor: pointer;">Logout</a>
  

  <script type="text/javascript">
    function Navigate()
    {   
         window.location.replace('http://localhost:8080/plymouthapp/user/userLog.jsp');
        return false;
    }
   </script>
</div>

<div id="main">
  <button class="openbtn" onclick="openNav()">☰ Admin</button>  
  <h2>Create Industry , University Accounts </h2>
  <h3>All Applied Receipts for Registration.</h3>
</div>

<script>
function openNav() {
  document.getElementById("mySidebar").style.width = "250px";
  document.getElementById("main").style.marginLeft = "250px";
}

function closeNav() {
  document.getElementById("mySidebar").style.width = "0";
  document.getElementById("main").style.marginLeft= "0";
}
</script>

<div style="margin-top:25px;padding:8px 8px 8px;font-size:18px">
 
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
byte[] filedata = null;
%>

 
<table align="center" cellpadding="7" cellspacing="10" border="0">
<tr>

</tr>
<tr bgcolor="#009900">

<td><b><font color="White">Organization</font></b></td>
<td><b><font color="White">User Type</font></b></td>
<td><b><font color="White">Selected Subjects</font></b></td>
<td><b><font color="White">Email</font></b></td>
<td><b><font color="White">Document</font></b></td>
<td><b><font color="White">Description</font></b></td>   
</tr>
<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName , userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM industry_reg_details where Status = 'Not Registered'";
resultSet = statement.executeQuery(sql);
while(resultSet.next())
{
%>
<tr bgcolor="#e6ffe6">

<td><%=resultSet.getString("organization") %></td>
<td><%=resultSet.getString("orgType")%></td>
<td><%=resultSet.getString("subjects") %></td>
<td><%=resultSet.getString("email")%></td>
<td>
    <form  method="get" action="../FileReadPdf" enctype="multipart/">
        <input type="hidden" name="doc" value="<%=resultSet.getString("uniID") %>"/>
    <input  type="submit"  value="Open PDF" />
    </form>
    
</td>
<td><%=resultSet.getString("other")%></td>
</tr>
<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</div>
    </body>
</html>
