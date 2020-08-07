<%-- 
    Document   : memberHome
    Created on : Apr 4, 2019, 8:29:37 PM
    Author     : Pubudu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<!DOCTYPE html>
<html>
    <head><!–– html header tag ––>
       <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Member Home</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!–– beginning of the style ––>
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
<!–– end of the style ––>

</head>
<body>
    <!–– html body ––>
<div id="mySidebar" class="sidebar">
    <%
        String UserName = session.getAttribute("UserName").toString(); //get the logged username
    %>
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">×</a>
  <a href="#" style="color:yellow"><%=UserName%></a><!–– display the username ––>
  <a href="http://localhost:8080/plymouthapp/events/retrieveIndustyPostJsp.jsp">All Industry Events</a><!–– redirect to all industry events ––>
  <a href="http://localhost:8080/plymouthapp/events/retrieveUniPostJsp.jsp">All University Events</a><!–– redirect to all university events ––>
  <a onclick="Navigate()" style="cursor: pointer;">Logout</a>
  
<!–– logout function ––>
  <script type="text/javascript">
    function Navigate()
    {   
        window.location.replace('http://localhost:8080/plymouthapp/user/userLog.jsp');
        return false;
    }
   </script>
  
</div>

<div id="main">
  <button class="openbtn" onclick="openNav()">☰ Member</button>  
  <h2>Sharing With University and Industry Talks , Workshops , Events , Research Mach more .... </h2>
  <h3  style="color: #009933;">All Upcoming Industry Events Order By Date.</h3>
</div>

  <!–– function to open and close navigation panel ––>
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

<!–– get from the database and display all upcoming events ––>
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

<table align="center" cellpadding="7" cellspacing="10" border="0">
<tr>

</tr>
<tr bgcolor="#ccccff">
<td><b> Name</b></td>
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
String sql ="SELECT * FROM industry_post_events ORDER BY eventTime DESC";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr bgcolor="#4dff4d">

<td><%=resultSet.getString("industryName") %></td>
<td><%=resultSet.getString("eventName") %></td>
<td><%=resultSet.getString("tagUnivercity") %></td>
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
